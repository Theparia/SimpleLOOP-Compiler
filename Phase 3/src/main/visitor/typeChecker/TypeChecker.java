package main.visitor.typeChecker;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.ast.types.NoType;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.ast.types.set.SetType;
import main.compileError.typeError.NoMainClass;
import main.compileError.typeError.UnsupportedTypeForPrint;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.*;
import main.compileError.typeError.*;

import java.util.ArrayList;

public class TypeChecker extends Visitor<Void> {
    private Graph<String> classHierarchy;
    ExpressionTypeChecker expressionTypeChecker;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private boolean reachedReturn = false;
    private boolean hasPrintedUnreachable = false;


    public TypeChecker(Graph<String> classHierarchy) {
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
    }

    @Override
    public Void visit(Program program) {
        boolean mainFound = false;
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables()) {
            variableDeclaration.accept(this);
        }
        for (ClassDeclaration classDeclaration : program.getClasses()) {
            if (classDeclaration.getClassName().getName().equals("Main"))
                mainFound = true;
            expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
        }

        if (!mainFound) {
            program.addError(new NoMainClass());
        }
        return null;
    }


    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        String parent;
        if (classDeclaration.getParentClassName() != null) {
            this.expressionTypeChecker.validateType(new ClassType(classDeclaration.getParentClassName()), classDeclaration);
            parent = classDeclaration.getParentClassName().getName();
            if (parent.equals("Main")) {
                classDeclaration.addError(new CannotExtendFromMainClass(classDeclaration.getLine()));
            }
            if (classDeclaration.getClassName().getName().equals("Main")) {
                classDeclaration.addError(new MainClassCantInherit(classDeclaration.getLine()));
            }
        }
        if (classDeclaration.getClassName().getName().equals("Main") && classDeclaration.getConstructor() == null) {
            classDeclaration.addError(new NoConstructorInMainClass(classDeclaration));
        }
        for (FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
//            System.out.println("LINE: "+fieldDeclaration.getLine() + " in field " + fieldDeclaration.getVarDeclaration().getVarName().getName());
            fieldDeclaration.accept(this);
        }
        if (classDeclaration.getConstructor() != null) {
            this.currentMethod = classDeclaration.getConstructor();
            expressionTypeChecker.setCurrentMethod(this.currentMethod);
            classDeclaration.getConstructor().accept(this);
        }
        for (MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            this.currentMethod = methodDeclaration;
            expressionTypeChecker.setCurrentMethod(this.currentMethod);
            if (!(methodDeclaration.getReturnType() instanceof VoidType))
                methodDeclaration.setDoesReturn(true);
            hasPrintedUnreachable = false;
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        if (this.currentClass.getClassName().getName().equals("Main") && constructorDeclaration.getArgs().size() != 0) {
            constructorDeclaration.addError(new MainConstructorCantHaveArgs(constructorDeclaration.getLine()));
        }
        this.visit((MethodDeclaration) constructorDeclaration);

        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        this.expressionTypeChecker.validateType(methodDeclaration.getReturnType(), methodDeclaration);
        boolean doesReturn = false;
        for (ArgPair argPair : methodDeclaration.getArgs()) {
            argPair.getVariableDeclaration().accept(this);
            Type type = argPair.getVariableDeclaration().getType();
            if (argPair.getDefaultValue() != null) {
                Type defaultValueType = argPair.getDefaultValue().accept(expressionTypeChecker);
                if (!(defaultValueType instanceof NoType || this.expressionTypeChecker.isSubtype(defaultValueType, type))) {
                    methodDeclaration.addError(new UnsupportedOperandType(methodDeclaration.getLine(), BinaryOperator.assign.name()));
                }
            }
        }
        for (VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars()) {
            variableDeclaration.accept(this);
        }

        boolean temp = false;
        for (Statement statement : methodDeclaration.getBody()) {
            if ((doesReturn || temp) && !hasPrintedUnreachable) {
                this.hasPrintedUnreachable = true;
                statement.addError(new UnreachableStatements(statement));
                break;
            }
            if (statement instanceof ReturnStmt) {
                doesReturn = true;
            }
            boolean prev = this.reachedReturn;
            statement.accept(this);
            temp = temp || this.reachedReturn;
            this.reachedReturn = prev;

        }
        if (!(methodDeclaration.getDoesReturn()) && (doesReturn || temp)) {
            methodDeclaration.addError(new VoidMethodHasReturn(methodDeclaration));
        }
        if ((methodDeclaration.getDoesReturn()) && !doesReturn && !temp) {
            methodDeclaration.addError(new MissingReturnStatement(methodDeclaration));
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        this.expressionTypeChecker.validateType(varDeclaration.getType(), varDeclaration);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type leftType = assignmentStmt.getlValue().accept(expressionTypeChecker);
        Type rightType = assignmentStmt.getrValue().accept(expressionTypeChecker);
        if (!expressionTypeChecker.isLvalue(assignmentStmt.getlValue())) {
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));
        }
        if (!(leftType instanceof NoType || this.expressionTypeChecker.isSubtype(rightType, leftType))) {
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.name()));
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement statement : blockStmt.getStatements()) {
            if (this.reachedReturn && ! hasPrintedUnreachable) {
                hasPrintedUnreachable = true;
                statement.addError(new UnreachableStatements(statement));
                break;
            }
            if (statement instanceof ReturnStmt)
                this.reachedReturn = true;

//            boolean lastReachedReturn =this.reachedReturn;
            statement.accept(this);


        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        boolean temp = true;
        Type ifCondition = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if (!(ifCondition instanceof BoolType || ifCondition instanceof NoType))
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        boolean prev = this.reachedReturn;
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getThenBody() instanceof ReturnStmt)
            this.reachedReturn = true;
        temp = temp && this.reachedReturn;
        this.reachedReturn = prev;
        if (conditionalStmt.getElseBody() != null) {
            prev = this.reachedReturn;
            conditionalStmt.getElseBody().accept(this);
            if (conditionalStmt.getElseBody() instanceof ReturnStmt)
                this.reachedReturn = true;
            temp = temp && this.reachedReturn;
            this.reachedReturn = prev;
        } else
            temp = false;
        for (ElsifStmt elsifStmt : conditionalStmt.getElsif()) {
            prev = this.reachedReturn;
            elsifStmt.accept(this);
            temp = temp && this.reachedReturn;
            this.reachedReturn = prev;
        }
        this.reachedReturn = temp;
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        Type elsifCondition = elsifStmt.getCondition().accept(expressionTypeChecker);
        if (!(elsifCondition instanceof BoolType || elsifCondition instanceof NoType))
            elsifStmt.addError(new ConditionNotBool(elsifStmt.getLine()));
        if (elsifStmt.getThenBody() instanceof ReturnStmt)
            this.reachedReturn = true;
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.setInMethod(true);
        methodCallStmt.getMethodCall().accept(expressionTypeChecker);
        expressionTypeChecker.setInMethod(false);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        Type argType = print.getArg().accept(expressionTypeChecker);
        if(!(argType instanceof IntType || argType instanceof ArrayType || argType instanceof SetType ||
                argType instanceof BoolType ||  argType instanceof NoType)) {
            UnsupportedTypeForPrint exception = new UnsupportedTypeForPrint(print.getLine());
            print.addError(exception);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        if(this.currentMethod.getReturnType() instanceof VoidType){
            returnStmt.addError(new VoidMethodHasReturn(this.currentMethod));
            return null;
        }
        Type returnType = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if (!this.expressionTypeChecker.isSubtype(returnType, currentMethod.getReturnType())) {
            returnStmt.addError(new ReturnValueNotMatchMethodReturnType(returnStmt));
        }
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        Type varType = eachStmt.getVariable().accept(expressionTypeChecker);
        Type listType = eachStmt.getList().accept(expressionTypeChecker);
        if (listType instanceof ArrayType) {
            Type listElementType = ((ArrayType) listType).getType();
            if (!this.expressionTypeChecker.isSubtype(varType, listElementType)) {
                eachStmt.addError(new EachVarNotMatchList(eachStmt));
            }
        } else if (!(listType instanceof NoType)) {
            eachStmt.addError(new EachCantIterateNoneArray(eachStmt.getLine()));
        }
        if (eachStmt.getBody() instanceof ReturnStmt)
            this.reachedReturn = true;
        eachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        setDelete.getSetArg().accept(expressionTypeChecker);
        setDelete.getElementArg().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(SetMerge setMerge) {
        setMerge.getSetArg().accept(expressionTypeChecker);
        ArrayList<Expression> elementArgs = setMerge.getElementArgs();
        {
            if (elementArgs.size() == 1) {
                Type inputType = elementArgs.get(0).accept(expressionTypeChecker);
                if (!(inputType instanceof SetType || inputType instanceof IntType || inputType instanceof NoType)) {
                    setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
                }
            } else if (elementArgs.size() > 1) { // for comma seperated ints
                for (Expression arg : elementArgs) {
                    Type inputType = arg.accept(expressionTypeChecker);
                    if (!(inputType instanceof IntType || inputType instanceof NoType)) {
                        setMerge.addError(new MergeInputNotSet(setMerge.getLine()));
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Void visit(SetAdd setAdd) {
        setAdd.getSetArg().accept(expressionTypeChecker);
        Type inputType = setAdd.getElementArg().accept(expressionTypeChecker);
        if (!(inputType instanceof IntType || inputType instanceof NoType)) {
            setAdd.addError(new AddInputNotInt(setAdd.getLine()));
        }
        return null;
    }

}
