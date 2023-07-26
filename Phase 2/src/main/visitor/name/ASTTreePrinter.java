package main.visitor.name;

import main.ast.nodes.*;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.SetValue;
import main.ast.nodes.expression.values.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.set.*;
import main.visitor.*;

import java.util.ArrayList;

public class ASTTreePrinter extends Visitor<Void> {
    public void messagePrinter(int line, String message){
        System.out.println("Line " + line + ": " + message);
    }

    @Override
    public Void visit(Program program) {
        messagePrinter(program.getLine(), program.toString());
        for (VariableDeclaration variableDeclaration : program.getGlobalVariables())
            variableDeclaration.accept(this);
        for (ClassDeclaration classDeclaration: program.getClasses())
            classDeclaration.accept(this);
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        //todo
        messagePrinter(classDeclaration.getLine(), classDeclaration.toString());
        if (classDeclaration.getParentClassName() != null){
            classDeclaration.getParentClassName().accept(this);
        }
        if (classDeclaration.getClassName() != null){
            classDeclaration.getClassName().accept(this);
        }
        if (classDeclaration.getFields() != null){
            for(FieldDeclaration fieldDeclaration: classDeclaration.getFields())
                fieldDeclaration.accept(this);
        }

        if(classDeclaration.getConstructor() != null)
            classDeclaration.getConstructor().accept(this);

        if (classDeclaration.getMethods() != null) {
            for (MethodDeclaration methodDeclaration : classDeclaration.getMethods())
                methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        //todo
        messagePrinter(constructorDeclaration.getLine(), constructorDeclaration.toString());
//        constructorDeclaration.getMethodName().accept(this);
        for (VariableDeclaration variableDeclaration: constructorDeclaration.getArgs())
            variableDeclaration.accept(this);
        for (VariableDeclaration variableDeclaration : constructorDeclaration.getLocalVars())
            variableDeclaration.accept(this);
        for (Statement statement : constructorDeclaration.getBody())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        //todo
        messagePrinter(methodDeclaration.getLine(), methodDeclaration.toString());
        if (methodDeclaration.getMethodName() != null){
            methodDeclaration.getMethodName().accept(this);
        }
        if (methodDeclaration.getArgs() != null) {
            for (VariableDeclaration variableDeclaration : methodDeclaration.getArgs())
                variableDeclaration.accept(this);
        }
        if (methodDeclaration.getLocalVars() != null) {
            for (VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars())
                variableDeclaration.accept(this);
        }
        if (methodDeclaration.getBody() != null) {
            for (Statement statement : methodDeclaration.getBody())
                statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        //todo
        messagePrinter(fieldDeclaration.getLine(), fieldDeclaration.toString());
        if (fieldDeclaration.getVarDeclaration() != null){
            fieldDeclaration.getVarDeclaration().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        //todo
        messagePrinter(varDeclaration.getLine(), varDeclaration.toString());
        if (varDeclaration.getVarName() != null){
            varDeclaration.getVarName().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        //todo
        messagePrinter(assignmentStmt.getLine(), assignmentStmt.toString());
        if (assignmentStmt.getlValue() != null){
            assignmentStmt.getlValue().accept(this);
        }
        if (assignmentStmt.getrValue() != null){
            assignmentStmt.getrValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        //todo
        messagePrinter(blockStmt.getLine(), blockStmt.toString());
        if (blockStmt.getStatements() != null) {
            for (Statement statement : blockStmt.getStatements())
                statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        //todo
        messagePrinter(conditionalStmt.getLine(), conditionalStmt.toString());
        conditionalStmt.getCondition().accept(this);
        if (conditionalStmt.getThenBody() != null){
            conditionalStmt.getThenBody().accept(this);
        }
        ArrayList<ElsifStmt> elseif =  conditionalStmt.getElsif();
        if (elseif != null){
            for (ElsifStmt elsifStmt : conditionalStmt.getElsif())
                elsifStmt.accept(this);
        }
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ElsifStmt elsifStmt) {
        //todo
        messagePrinter(elsifStmt.getLine(), elsifStmt.toString());
        if (elsifStmt.getCondition() != null)
            elsifStmt.getCondition().accept(this);
        if (elsifStmt.getThenBody() != null)
            elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        //todo
        messagePrinter(methodCallStmt.getLine(), methodCallStmt.toString());
        if (methodCallStmt.getMethodCall() != null)
            methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        //todo
        messagePrinter(print.getLine(), print.toString());
        if ( print.getArg() != null){
            print.getArg().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        //todo
        messagePrinter(returnStmt.getLine(), returnStmt.toString());
        if (returnStmt.getReturnedExpr() != null){
            returnStmt.getReturnedExpr().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(EachStmt eachStmt) {
        //todo
        messagePrinter(eachStmt.getLine(), eachStmt.toString());
        if (eachStmt.getVariable() != null){
            eachStmt.getVariable().accept(this);
        }
        if (eachStmt.getList() != null){
            eachStmt.getList().accept(this);
        }
        if (eachStmt.getBody() != null){
            eachStmt.getBody().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        //todo
        messagePrinter(binaryExpression.getLine(), binaryExpression.toString());
        if(binaryExpression.getFirstOperand() != null){
            binaryExpression.getFirstOperand().accept(this);
        }
        if(binaryExpression.getSecondOperand() != null){
            binaryExpression.getSecondOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        //todo
        messagePrinter(unaryExpression.getLine(), unaryExpression.toString());
        if (unaryExpression.getOperand() != null){
            unaryExpression.getOperand().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(TernaryExpression ternaryExpression) {
        //todo
        messagePrinter(ternaryExpression.getLine(), ternaryExpression.toString());
        if (ternaryExpression.getCondition() != null){
            ternaryExpression.getCondition().accept(this);
        }
        if (ternaryExpression.getTrueExpression() != null){
            ternaryExpression.getTrueExpression().accept(this);
        }
        if (ternaryExpression.getFalseExpression() != null){
            ternaryExpression.getFalseExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ObjectMemberAccess objectOrListMemberAccess) {
        //todo
        messagePrinter(objectOrListMemberAccess.getLine(), objectOrListMemberAccess.toString());
        if (objectOrListMemberAccess.getInstance() != null){
            objectOrListMemberAccess.getInstance().accept(this);
        }
        if (objectOrListMemberAccess.getMemberName() != null){
            objectOrListMemberAccess.getMemberName().accept(this);
        }

        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        //todo
        messagePrinter(identifier.getLine(), identifier.toString());
        return null;
    }

    @Override
    public Void visit(ArrayAccessByIndex arrayAccessByIndex) {
        //todo
        messagePrinter(arrayAccessByIndex.getLine(), arrayAccessByIndex.toString());
        if (arrayAccessByIndex.getInstance() != null){
            arrayAccessByIndex.getInstance().accept(this);
        }
        if (arrayAccessByIndex.getIndex() != null) {
            arrayAccessByIndex.getIndex().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        //todo
        messagePrinter(methodCall.getLine(), methodCall.toString());
        if(methodCall.getInstance() != null){
            methodCall.getInstance().accept(this);
        }
        ArrayList<Expression> args = methodCall.getArgs();
        if (args != null) {
            for (Expression expression : methodCall.getArgs())
                expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        //todo
        messagePrinter(newClassInstance.getLine(), newClassInstance.toString());
        ArrayList<Expression> args = newClassInstance.getArgs();
        if (args != null) {
            for (Expression expression : newClassInstance.getArgs())
                expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SelfClass selfClass) {
        //todo
        messagePrinter(selfClass.getLine(), selfClass.toString());
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        //todo
        messagePrinter(nullValue.getLine(), nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        //todo
        messagePrinter(intValue.getLine(), intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        //todo
        messagePrinter(boolValue.getLine(), boolValue.toString());
        return null;
    }

    @Override
    public Void visit(SetInclude setAdd) {///////////////////////////////
        //todo
        messagePrinter(setAdd.getLine(), setAdd.toString());
        if (setAdd.getSetArg() != null){
            setAdd.getSetArg().accept(this);
        }
        if (setAdd.getElementArg() != null){
            setAdd.getElementArg().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SetValue setValue) {
        //todo
        messagePrinter(setValue.getLine(), setValue.toString());
        ArrayList<IntValue> elements = setValue.getElements();
        if (setValue.getElements() != null) {
            for (IntValue intValue : setValue.getElements())
                intValue.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SetNew setMerge) {
        //todo
        messagePrinter(setMerge.getLine(), setMerge.toString());
        ArrayList<Expression> args = setMerge.getArgs();
        if (args != null) {
            for (Expression expression : setMerge.getArgs())
                expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SetDelete setDelete) {
        //todo
        messagePrinter(setDelete.getLine(), setDelete.toString());
        if (setDelete.getSetArg() != null){
            setDelete.getSetArg().accept(this);
        }
        if (setDelete.getElementArg() != null){
            setDelete.getElementArg().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(SetMerge setAdd) {
        //todo
        messagePrinter(setAdd.getLine(), setAdd.toString());
        if (setAdd.getSetArg() != null){
            setAdd.getSetArg().accept(this);
        }
        ArrayList<Expression> args = setAdd.getElementArgs();
        if (args != null) {
            for (Expression expression : setAdd.getElementArgs())
                expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(RangeExpression rangeExpression) {
        //todo
        messagePrinter(rangeExpression.getLine(), rangeExpression.toString());
        if (rangeExpression.getLeftExpression() != null){
            rangeExpression.getLeftExpression().accept(this);
        }
        if (rangeExpression.getRightExpression() != null){
            rangeExpression.getRightExpression().accept(this);
        }
        return null;
    }
}
