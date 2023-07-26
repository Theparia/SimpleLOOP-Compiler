package main.visitor.name;

import main.ast.nodes.Node;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.ArrayAccessByIndex;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.SetDelete;
import main.ast.nodes.statement.set.SetMerge;
import main.visitor.Visitor;
import main.compileError.CompileError;
import java.util.ArrayList;


public class ErrorReporter extends Visitor<Integer> {

    private int printErrors(Node node) {
        ArrayList<CompileError> errors = node.flushErrors();
        for(CompileError compileErrorException : errors) {
            System.out.println(compileErrorException.getMessage());
        }
        return errors.size();
    }

    @Override
    public Integer visit(Program program) {
        int errorCount = printErrors(program);
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            errorCount += variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            errorCount += classDeclaration.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(ClassDeclaration classDeclaration) {
        int errorCount = printErrors(classDeclaration);
        errorCount += classDeclaration.getClassName().accept(this);
        for(FieldDeclaration fieldDeclaration: classDeclaration.getFields())
            errorCount += fieldDeclaration.accept(this);
        if(classDeclaration.getConstructor() != null)
            errorCount += classDeclaration.getConstructor().accept(this);
        for (MethodDeclaration methodDeclaration :classDeclaration.getMethods())
            errorCount += methodDeclaration.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(ConstructorDeclaration constructorDeclaration) {
        int errorCount = printErrors(constructorDeclaration);
        errorCount += constructorDeclaration.getMethodName().accept(this);
        for (VariableDeclaration variableDeclaration: constructorDeclaration.getArgs())
            errorCount += variableDeclaration.accept(this);
        for (VariableDeclaration variableDeclaration : constructorDeclaration.getLocalVars())
            errorCount += variableDeclaration.accept(this);
        for (Statement statement : constructorDeclaration.getBody())
            errorCount += statement.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(MethodDeclaration methodDeclaration) {
        int errorCount = printErrors(methodDeclaration);
        errorCount += methodDeclaration.getMethodName().accept(this);
        for (VariableDeclaration variableDeclaration: methodDeclaration.getArgs())
            errorCount += variableDeclaration.accept(this);
        for(VariableDeclaration variableDeclaration: methodDeclaration.getLocalVars())
            errorCount += variableDeclaration.accept(this);
        for (Statement statement: methodDeclaration.getBody())
            errorCount += statement.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(FieldDeclaration fieldDeclaration) {
        int errorCount = printErrors(fieldDeclaration);
        errorCount += fieldDeclaration.getVarDeclaration().accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(VariableDeclaration varDeclaration) {
        int errorCount = printErrors(varDeclaration);
        errorCount += varDeclaration.getVarName().accept(this); //check konim null nabashe?
        return errorCount;
    }

    @Override
    public Integer visit(AssignmentStmt assignmentStmt) {
        int errorCount = printErrors(assignmentStmt);
        errorCount += assignmentStmt.getlValue().accept(this);
        errorCount += assignmentStmt.getrValue().accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(BlockStmt blockStmt) {
        int errorCount = printErrors(blockStmt);
        for (Statement statement : blockStmt.getStatements())
            errorCount += statement.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(ConditionalStmt conditionalStmt) {
        int errorCount = printErrors(conditionalStmt);
        if (conditionalStmt.getCondition() != null){
            errorCount += conditionalStmt.getCondition().accept(this);
        }
        if (conditionalStmt.getThenBody() != null){
            errorCount += conditionalStmt.getThenBody().accept(this);
        }
        if (conditionalStmt.getElseBody() != null){
            errorCount += conditionalStmt.getElseBody().accept(this);
        }
        if (conditionalStmt.getElsif() != null){
            for (ElsifStmt elsifStmt : conditionalStmt.getElsif())
                errorCount += elsifStmt.accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(ElsifStmt elsifStmt) {
        int errorCount = printErrors(elsifStmt);
        if (elsifStmt.getCondition() != null){
            errorCount += elsifStmt.getCondition().accept(this);
        }
        if (elsifStmt.getThenBody() != null){
            errorCount += elsifStmt.getThenBody().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(MethodCallStmt methodCallStmt) {
        int errorCount = printErrors(methodCallStmt);
        if (methodCallStmt.getMethodCall() != null) {
            errorCount += methodCallStmt.getMethodCall().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(PrintStmt print) {
        int errorCount = printErrors(print);
        if (print.getArg() != null) {
            errorCount += print.getArg().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(ReturnStmt returnStmt) {
        int errorCount = printErrors(returnStmt);
        if (returnStmt.getReturnedExpr() != null) {
            errorCount += returnStmt.getReturnedExpr().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(EachStmt eachStmt) {
        int errorCount = printErrors(eachStmt);
        if (eachStmt.getVariable() != null) {
            errorCount += eachStmt.getVariable().accept(this);
        }
        if (eachStmt.getBody() != null) {
            errorCount += eachStmt.getBody().accept(this);
        }
        if (eachStmt.getList() != null) {
            errorCount += eachStmt.getList().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(BinaryExpression binaryExpression) {
        int errorCount = printErrors(binaryExpression);
        if (binaryExpression.getFirstOperand() != null) {
            errorCount += binaryExpression.getFirstOperand().accept(this);
        }
        if (binaryExpression.getSecondOperand() != null) {
            errorCount += binaryExpression.getSecondOperand().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(UnaryExpression unaryExpression) {
        int errorCount = printErrors(unaryExpression);
        if (unaryExpression.getOperand() != null) {
            errorCount += unaryExpression.getOperand().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(TernaryExpression ternaryExpression) {
        int errorCount = printErrors(ternaryExpression);
        errorCount += ternaryExpression.getCondition().accept(this);
        errorCount += ternaryExpression.getTrueExpression().accept(this);
        errorCount += ternaryExpression.getFalseExpression().accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(ObjectMemberAccess objectOrListMemberAccess) {
        int errorCount = printErrors(objectOrListMemberAccess);
        errorCount += objectOrListMemberAccess.getMemberName().accept(this);
        errorCount += objectOrListMemberAccess.getInstance().accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(Identifier identifier) {
        int errorCount = printErrors(identifier);
        return errorCount;
    }

    @Override
    public Integer visit(ArrayAccessByIndex arrayAccessByIndex) {
        int errorCount = printErrors(arrayAccessByIndex);
        if (arrayAccessByIndex.getIndex() != null) {
            errorCount += arrayAccessByIndex.getIndex().accept(this);
        }
        if (arrayAccessByIndex.getInstance() != null) {
            errorCount += arrayAccessByIndex.getInstance().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(MethodCall methodCall) {
        int errorCount = printErrors(methodCall);
        if (methodCall.getInstance() != null) {
            errorCount += methodCall.getInstance().accept(this);
        }
        for (Expression expression : methodCall.getArgs())
            errorCount += expression.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(NewClassInstance newClassInstance) {
        int errorCount = printErrors(newClassInstance);
        for (Expression expression : newClassInstance.getArgs())
            errorCount += expression.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(SelfClass selfClass) {
        int errorCount = printErrors(selfClass);
        return errorCount;
    }

    @Override
    public Integer visit(NullValue nullValue) {
        int errorCount = printErrors(nullValue);
        return errorCount;
    }

    @Override
    public Integer visit(IntValue intValue) {
        int errorCount = printErrors(intValue);
        return errorCount;
    }

    @Override
    public Integer visit(BoolValue boolValue) {
        int errorCount = printErrors(boolValue);
        return errorCount;
    }

    @Override
    public Integer visit(SetInclude setAdd) {
        int errorCount = printErrors(setAdd);
        if (setAdd.getElementArg() != null) {
            errorCount += setAdd.getElementArg().accept(this);
        }
        if (setAdd.getSetArg() != null) {
            errorCount += setAdd.getSetArg().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(SetValue setValue) {
        int errorCount = printErrors(setValue);
        for (IntValue intValue : setValue.getElements())
            errorCount += intValue.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(SetNew setMerge) {
        int errorCount = printErrors(setMerge);
        for (Expression expression : setMerge.getArgs())
            errorCount += expression.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(SetDelete setDelete) {
        int errorCount = printErrors(setDelete);
        if (setDelete.getElementArg() != null){
            setDelete.getElementArg().accept(this);
        }
        if (setDelete.getSetArg() != null){
            setDelete.getSetArg().accept(this);
        }
        return errorCount;
    }

    @Override
    public Integer visit(SetMerge setAdd) {
        int errorCount = printErrors(setAdd);
        if (setAdd.getSetArg() != null) {
            errorCount += setAdd.getSetArg().accept(this);
        }
        for (Expression expression : setAdd.getElementArgs())
            errorCount += expression.accept(this);
        return errorCount;
    }

    @Override
    public Integer visit(RangeExpression rangeExpression) {
        int errorCount = printErrors(rangeExpression);
        if (rangeExpression.getLeftExpression() != null) {
            errorCount += rangeExpression.getLeftExpression().accept(this);
        }
        if (rangeExpression.getRightExpression() != null) {
            errorCount += rangeExpression.getRightExpression().accept(this);
        }
        return errorCount;
    }
}
