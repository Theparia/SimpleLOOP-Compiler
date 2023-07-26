package main.visitor.typeChecker;

import main.ast.nodes.Node;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.TernaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.NoType;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.compileError.typeError.ClassNotDeclared;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.ast.types.primitives.VoidType;
import main.ast.types.set.SetType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.Visitor;

import java.util.ArrayList;

import static main.ast.nodes.expression.operators.UnaryOperator.postdec;
import static main.ast.nodes.expression.operators.UnaryOperator.postinc;

public class ExpressionTypeChecker extends Visitor<Type> {
    private Graph<String> classHierarchy;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private boolean Lvalue = false;
    private boolean inMethod = false, isFptr = true;
    private int numberOfNotGivenArguments;

    public void setCurrentClass(ClassDeclaration currentClass) {
        this.currentClass = currentClass;
    }

    public void setCurrentMethod(MethodDeclaration currentMethod) {
        this.currentMethod = currentMethod;
    }

    public void setInMethod(boolean inMethod) {
        this.inMethod = inMethod;
    }

    public int validateType(Type type, Node node) {
        int validationErrors = 0;
        if (type instanceof ArrayType) {
            Type elementType = ((ArrayType) type).getType();
            ArrayList<Expression> dimensions = ((ArrayType) type).getDimensions();
            this.validateType(elementType, node);
            for (Expression dim : dimensions) {
                if (dim instanceof IntValue && ((IntValue) dim).getConstant() == 0) {
                    node.addError(new CannotHaveEmptyArray(node.getLine()));
                    validationErrors++;
                }
            }
        } else if (type instanceof ClassType) { //for inheritance
            String className = ((ClassType) type).getClassName().getName();
            if (!this.classHierarchy.doesGraphContainNode(className)) {
                node.addError(new ClassNotDeclared(node.getLine(), className));
                validationErrors++;
            }
        } else if (type instanceof FptrType) {
            ArrayList<Type> argumentsTypes = ((FptrType) type).getArgumentsTypes();
            Type returnType = ((FptrType) type).getReturnType();
            this.validateType(returnType, node);
            for (Type argumentType : argumentsTypes)
                this.validateType(argumentType, node);
        }
        return validationErrors;
    }

    public boolean isSubtype(Type first, Type second) {
        if (first instanceof NoType)
            return true;
        if (second instanceof NoType)
            return false;
        else if ((first instanceof IntType && second instanceof IntType) || (first instanceof BoolType && second instanceof BoolType) ||
                (first instanceof SetType && second instanceof SetType) || (first instanceof VoidType && second instanceof VoidType))
            return true;
        else if (first instanceof NullType)
            return second instanceof NullType || second instanceof ClassType || second instanceof SetType || second instanceof FptrType;
        else if (first instanceof ClassType && second instanceof ClassType)
            return this.classHierarchy.isSecondNodeAncestorOf(((ClassType) first).getClassName().getName(), ((ClassType) second).getClassName().getName());
        else if (first instanceof ArrayType && second instanceof ArrayType) //size mikhad??
            return this.isSubtype(((ArrayType) first).getType(), ((ArrayType) second).getType());
        else if (first instanceof FptrType && second instanceof FptrType) {
            if (!this.isSubtype(((FptrType) first).getReturnType(), ((FptrType) second).getReturnType()))
                return false;
            ArrayList<Type> firstArgs = ((FptrType) first).getArgumentsTypes();
            ArrayList<Type> secondArgs = ((FptrType) second).getArgumentsTypes();
            if (firstArgs.size() != secondArgs.size())
                return false;
            for (int i = 0; i < firstArgs.size(); i++) {
                if (!this.isSubtype(firstArgs.get(i), secondArgs.get(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    public ArrayList<Type> getMethodTypes(MethodDeclaration methodDeclaration) {
        ArrayList<Type> args = new ArrayList<>();
        for (ArgPair argPair : methodDeclaration.getArgs()) {
            args.add(argPair.getVariableDeclaration().getType());
        }
        return args;
    }

    public Type applyValidateType(Type type) {
        if (validateType(type, new NullValue()) > 0) {
            return new NoType();
        }
        return type;
    }

    public boolean isLvalue(Expression expression) {
        boolean lastIsCatchErrorsActive = Node.isCatchErrorsActive;
        boolean lastLvalue = this.Lvalue;
        Node.isCatchErrorsActive = false;
        this.Lvalue = true;
        expression.accept(this);
        boolean expLvalue = this.Lvalue;
        this.Lvalue = lastLvalue;
        Node.isCatchErrorsActive = lastIsCatchErrorsActive;
        return expLvalue;
    }

    public void setNumberOfNotGivenArguments(MethodDeclaration methodDeclaration) {
        int num = 0;
        for (ArgPair argPair : methodDeclaration.getArgs())
            if (argPair.getDefaultValue() == null)
                num++;
        this.numberOfNotGivenArguments = num;
    }

    public ExpressionTypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        this.Lvalue = false;
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);
        switch (operator) {
            case add, sub, mult, div -> {
                if ((firstType instanceof IntType && secondType instanceof IntType))
                    return new IntType();
                else if ((firstType instanceof IntType && secondType instanceof NoType) ||
                        (firstType instanceof NoType && secondType instanceof IntType) ||
                        (firstType instanceof NoType && secondType instanceof NoType))
                    return new NoType();
                else {
                    binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                    return new NoType();
                }
            }
            case gt, lt -> {
                if (firstType instanceof IntType && secondType instanceof IntType)
                    return new BoolType();
                else if ((firstType instanceof IntType && secondType instanceof NoType) ||
                        (firstType instanceof NoType && secondType instanceof IntType) ||
                        (firstType instanceof NoType && secondType instanceof NoType))
                    return new NoType();
                else {
                    binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                    return new NoType();
                }
            }
            case assign -> {
                boolean isFirstLvalue = this.isLvalue(binaryExpression.getFirstOperand());
                if (!isFirstLvalue) {
                    binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));
                }
                if (firstType instanceof NoType)
                    return new NoType();
                else if (this.isSubtype(secondType, firstType)) {
                    binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                    return new NoType();
                } else if (isFirstLvalue)
                    return secondType;
                else
                    return new NoType();
            }
            case and, or -> {
                if (firstType instanceof BoolType && secondType instanceof BoolType)
                    return new BoolType();
                else if ((firstType instanceof BoolType && secondType instanceof NoType) ||
                        (firstType instanceof NoType && secondType instanceof BoolType) ||
                        (firstType instanceof NoType && secondType instanceof NoType))
                    return new BoolType();
                else {
                    UnsupportedOperandType err = new UnsupportedOperandType(binaryExpression.getLine(), operator.toString());
                    binaryExpression.addError(err);
                    return new NoType();
                }
            }
            case eq -> { // neq ??
                boolean areOperandsValid = !(firstType instanceof ArrayType || secondType instanceof ArrayType || firstType instanceof SetType || secondType instanceof SetType);
                if ((firstType instanceof NoType || secondType instanceof NoType) && areOperandsValid)
                    return new NoType();
                else if ((firstType instanceof NullType && (secondType instanceof ClassType || secondType instanceof FptrType)) ||
                        (secondType instanceof NullType && (firstType instanceof ClassType || firstType instanceof FptrType)))
                    return new BoolType();
                else if (this.isSubtype(firstType, secondType) && this.isSubtype(secondType, firstType) && areOperandsValid)
                    return new BoolType();
                else {
                    binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                    return new NoType();
                }
            }
        }
        return new NoType();
    }


    @Override
    public Type visit(NewClassInstance newClassInstance) {
        this.Lvalue = false;
        String className = newClassInstance.getClassType().getClassName().getName();
        ArrayList<Type> args = new ArrayList<>();
        for (Expression expression : newClassInstance.getArgs())
            args.add(expression.accept(this));
        try {
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true);
            ConstructorDeclaration constructorDeclaration = classSymbolTableItem.getClassDeclaration().getConstructor();
            ArrayList<Type> constructorTypes = new ArrayList<>();
            if(constructorDeclaration != null) {
                constructorTypes = this.getMethodTypes(constructorDeclaration);
                setNumberOfNotGivenArguments(constructorDeclaration);
            }
            else
                this.numberOfNotGivenArguments = 0;
            if (args.size() < this.numberOfNotGivenArguments|| args.size() > constructorTypes.size()) {
                newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                return new NoType();
            }
            for (int i = 0; i < args.size(); i++) {
                if (!this.isSubtype(args.get(i), constructorTypes.get(i))) {
                    newClassInstance.addError(new ConstructorArgsNotMatchDefinition(newClassInstance));
                    return new NoType();
                }
            }
            return newClassInstance.getClassType();
        } catch (ItemNotFoundException ignored) {
            newClassInstance.addError(new ClassNotDeclared(newClassInstance.getLine(), className));
            return new NoType();
        }
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        this.Lvalue = false;
        Type operandType = unaryExpression.getOperand().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        switch (operator) {
            case postinc, postdec -> {
                boolean isOperandLvalue = this.isLvalue(unaryExpression.getOperand());
                if (!isOperandLvalue) {
                    unaryExpression.addError(new IncDecOperandNotLvalue(unaryExpression.getLine(), operator.name()));
                }
                if (operandType instanceof NoType)
                    return new NoType();
                if (isOperandLvalue && operandType instanceof IntType) {
                    return operandType;
                }
                if (!isOperandLvalue && operandType instanceof IntType) {
                    return new NoType();
                }
                UnsupportedOperandType unsupportedOperandType = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
                unaryExpression.addError(unsupportedOperandType);
                return new NoType();
            }
            case not -> {
                if (operandType instanceof NoType)
                    return new NoType();
                if (operandType instanceof BoolType)
                    return operandType;
            }
            case minus -> {
                if (operandType instanceof NoType)
                    return new NoType();
                if (operandType instanceof IntType)
                    return operandType;
            }
        }
        UnsupportedOperandType unsupportedOperandType = new UnsupportedOperandType(unaryExpression.getLine(), operator.name());
        unaryExpression.addError(unsupportedOperandType);
        return new NoType();
    }

    @Override
    public Type visit(MethodCall methodCall) {
        this.Lvalue = false;
        Type instanceType = methodCall.getInstance().accept(this);
        boolean lastInMethod = this.inMethod;
        this.setInMethod(false);
        ArrayList<Type> argsTypes = new ArrayList<>();
        for (Expression arg : methodCall.getArgs()) {
            argsTypes.add(arg.accept(this));
        }
        this.setInMethod(lastInMethod);

        if (!(instanceType instanceof NoType || instanceType instanceof FptrType)) {
            methodCall.addError(new CallOnNoneCallable(methodCall.getLine()));
            return new NoType();
        } else if (instanceType instanceof NoType) {
            return new NoType();
        } else {
            ArrayList<Type> fptrArgsTypes = ((FptrType) instanceType).getArgumentsTypes();
            Type fptrReturnType = ((FptrType) instanceType).getReturnType();
            boolean hasError = false;
            if (!this.inMethod && (fptrReturnType instanceof VoidType)) {
//                System.out.println(instanceType.toString() + " cantUse " + methodCall.getLine());
                methodCall.addError(new CantUseValueOfVoidMethod(methodCall.getLine()));
                return new VoidType();
            }
//            System.out.println("line: " + methodCall.getLine() + " argsTypes.size(): " + argsTypes.size() + " this.numberOfNotGivenArguments " + this.numberOfNotGivenArguments + " fptrArgsTypes.size() " + fptrArgsTypes.size());
            //if(argsTypes.size() != fptrArgsTypes.size())
            if ((isFptr && argsTypes.size() != fptrArgsTypes.size()) ||
                    (!isFptr && argsTypes.size() < this.numberOfNotGivenArguments || argsTypes.size() > fptrArgsTypes.size())) {
                methodCall.addError(new MethodCallNotMatchDefinition(methodCall.getLine()));
                isFptr = true;
                return new NoType();
            }
            isFptr = true;
            for (int i = 0; i < argsTypes.size(); i++) {
                if (!isSubtype(argsTypes.get(i), fptrArgsTypes.get(i))) {
                    methodCall.addError(new MethodCallNotMatchDefinition(methodCall.getLine()));
                    return new NoType();
                }
            }
//            if (hasError)
//                return new NoType();
            return this.applyValidateType(fptrReturnType);

        }
    }

    @Override
    public Type visit(Identifier identifier) {
//        System.out.println("LINE: "+identifier.getLine() + " in IDENTIFIER " + identifier.getName());
        try {
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + this.currentClass.getClassName().getName(), true);
            SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();
            MethodSymbolTableItem methodSymbolTableItem = (MethodSymbolTableItem) classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + this.currentMethod.getMethodName().getName(), true);
            SymbolTable methodSymbolTable = methodSymbolTableItem.getMethodSymbolTable();
            LocalVariableSymbolTableItem localVariableSymbolTableItem = (LocalVariableSymbolTableItem) methodSymbolTable.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName(), true);
            if (validateType(localVariableSymbolTableItem.getType(), new NullValue()) > 0)
                return new NoType();
            else
                return localVariableSymbolTableItem.getType();
        } catch (ItemNotFoundException e1) {
            try {
                LocalVariableSymbolTableItem localVariableSymbolTableItem = (LocalVariableSymbolTableItem) SymbolTable.root.getItem(LocalVariableSymbolTableItem.START_KEY + identifier.getName(), true);
//            System.out.println("LINE: "+identifier.getLine() + " identifier global " + identifier.getName());
                return localVariableSymbolTableItem.getType();
            } catch (ItemNotFoundException e2) {
                identifier.addError(new VarNotDeclared(identifier.getLine(), identifier.getName()));
                return new NoType();
            }
        }
    }

    @Override
    public Type visit(ArrayAccessByIndex arrayAccessByIndex) {
        Type instanceType = arrayAccessByIndex.getInstance().accept(this);
        boolean lastLvalue = this.Lvalue;
        Type indexType = arrayAccessByIndex.getIndex().accept(this);
        this.Lvalue = lastLvalue;
        if (!(indexType instanceof IntType || indexType instanceof NoType)) {
            arrayAccessByIndex.addError(new ArrayIndexNotInt(arrayAccessByIndex.getLine()));
//            return new NoType();
        }
        if (instanceType instanceof NoType)
            return new NoType();
        if (!(instanceType instanceof ArrayType)) {
            arrayAccessByIndex.addError(new AccessByIndexOnNoneArray(arrayAccessByIndex.getLine()));
            return new NoType();
        } else {
            if (indexType instanceof IntType)
                return ((ArrayType) instanceType).getType();
            else
                return new NoType();
        }
    }

    @Override
    public Type visit(ObjectMemberAccess objectMemberAccess) {
        boolean lastLvalue = this.Lvalue;
        Type instanceType = objectMemberAccess.getInstance().accept(this);
        String memberName = objectMemberAccess.getMemberName().getName();
        //System.out.println("line: " + objectMemberAccess.getLine() + " instanceType" + instanceType.toString() + " name:" + memberName);
        if (instanceType instanceof NoType)
            return new NoType();
        if (objectMemberAccess.getInstance() instanceof SelfClass)
            this.Lvalue = lastLvalue;
        if (instanceType instanceof ClassType) {
            SymbolTable classSymbolTable;
            try {
                classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + ((ClassType) instanceType).getClassName().getName(), true)).getClassSymbolTable();
            } catch (ItemNotFoundException classNotFound) {
                return new NoType();
            }
            try {
                FieldSymbolTableItem fieldSymbolTableItem = (FieldSymbolTableItem) classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + memberName, true);
                return this.applyValidateType(fieldSymbolTableItem.getType());
            } catch (ItemNotFoundException memberNotField) {
                try {
                    MethodSymbolTableItem methodSymbolTableItem = (MethodSymbolTableItem) classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + memberName, true);
                    this.Lvalue = false;
                    this.setNumberOfNotGivenArguments(methodSymbolTableItem.getMethodDeclaration());
                    isFptr = false;
                    //int numberOfNotGivenArguments = this.getNumberOfNotGivenArguments(methodSymbolTableItem.getMethodDeclaration());
                    return new FptrType(methodSymbolTableItem.getArgTypes(), methodSymbolTableItem.getReturnType());
                } catch (ItemNotFoundException memberNotFound) {
                    objectMemberAccess.addError(new MemberNotAvailableInClass(objectMemberAccess.getLine(), memberName, ((ClassType) instanceType).getClassName().getName()));
                    return new NoType();
                }
            }
        }
        objectMemberAccess.addError(new AccessOnNonClass(objectMemberAccess.getLine()));
        return new NoType();
    }

    @Override
    public Type visit(SetNew setNew) {
        this.Lvalue = false;
        ArrayList<Type> args = new ArrayList<>();
        for (Expression expression : setNew.getArgs())
            args.add(expression.accept(this));
        for (Type type : args) {
            if (!(type instanceof IntType || type instanceof NoType)) {
                setNew.addError(new NewInputNotSet(setNew.getLine()));
                return new NoType();
            }
        }
        return new SetType();
    }

    @Override
    public Type visit(SetInclude setInclude) {
        this.Lvalue = false;
        setInclude.getSetArg().accept(this);
        Type inputType = setInclude.getElementArg().accept(this);
        if (!(inputType instanceof IntType || inputType instanceof NoType)) {
            setInclude.addError(new SetIncludeInputNotInt(setInclude.getLine()));
        }
        return new BoolType();
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        this.Lvalue = false;
        Type leftType = rangeExpression.getLeftExpression().accept(this);
        Type rightType = rangeExpression.getRightExpression().accept(this);
        if (!((leftType instanceof IntType || leftType instanceof NoType) && (rightType instanceof IntType || rightType instanceof NoType))) {
            rangeExpression.addError(new EachRangeNotInt(rangeExpression.getLine()));
            return new NoType();
        }
        ArrayList<Expression> dims = new ArrayList<>();
        dims.add(new BinaryExpression(rangeExpression.getRightExpression(), rangeExpression.getLeftExpression(), BinaryOperator.sub));
        return new ArrayType(new IntType(), dims);
    }

    @Override
    public Type visit(TernaryExpression ternaryExpression) {
        this.Lvalue = false;
        Type conditionType = ternaryExpression.getCondition().accept(this);
        Type trueExpressionType = ternaryExpression.getTrueExpression().accept(this);
        Type falseExpressionType = ternaryExpression.getFalseExpression().accept(this);
        if (!(conditionType instanceof BoolType || conditionType instanceof NoType)) {
            ternaryExpression.addError(new ConditionNotBool(ternaryExpression.getLine()));
//            return new NoType();
        }
        if (!(isSubtype(trueExpressionType, falseExpressionType) && isSubtype(falseExpressionType, trueExpressionType))) {
            ternaryExpression.addError(new UnsupportedOperandType(ternaryExpression.getLine(), TernaryOperator.ternary.toString()));
            return new NoType();
        } else
            return trueExpressionType;
    }

    @Override
    public Type visit(IntValue intValue) {
        this.Lvalue = false;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        this.Lvalue = false;
        return new BoolType();
    }

    @Override
    public Type visit(SelfClass selfClass) {
        this.Lvalue = false;
        return new ClassType(this.currentClass.getClassName());
    }

    @Override
    public Type visit(SetValue setValue) {
        this.Lvalue = false;
        return new SetType();
    }

    @Override
    public Type visit(NullValue nullValue) {
        this.Lvalue = false;
        return new NullType();
    }
}
