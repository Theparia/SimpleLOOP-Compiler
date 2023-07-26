package main.visitor.name.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.compileError.nameError.*;
import main.compileError.nameError.LocalVarRedefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.LocalVariableSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.GlobalVariableSymbolTableItem;
import main.visitor.Visitor;


public class SymbolTableCreator extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable.push(new SymbolTable());
        SymbolTable.globalProgram = SymbolTable.top;
        for(VariableDeclaration variableDeclaration : program.getGlobalVariables()) {
            try {
                SymbolTable.top.put(new GlobalVariableSymbolTableItem(variableDeclaration));
            }
            catch (ItemAlreadyExistsException e) {
                GlobalVarRedefinition exception = new GlobalVarRedefinition(variableDeclaration.getLine(), variableDeclaration.getVarName().getName());
                variableDeclaration.addError(exception);
            }
        }
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem classSymbolTableItem = new ClassSymbolTableItem(classDeclaration);
        SymbolTable.push(new SymbolTable(SymbolTable.top));
        classSymbolTableItem.setClassSymbolTable(SymbolTable.top);
        try {
            SymbolTable.globalProgram.put(classSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            ClassRedefinition classRedefinition = new ClassRedefinition(classDeclaration.getLine(), classDeclaration.getClassName().getName());
            classDeclaration.addError(classRedefinition);
        }
        if(classDeclaration.getFields() != null) {
            for (FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
                fieldDeclaration.accept(this);
            }
        }
        if(classDeclaration.getConstructor() != null) {
            classDeclaration.getConstructor().accept(this);
        }
        if (classDeclaration.getMethods() != null) {
            for (MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
                methodDeclaration.accept(this);
            }
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(methodDeclaration);
        SymbolTable methodSymbolTable = new SymbolTable(SymbolTable.top);
        methodSymbolTableItem.setMethodSymbolTable(methodSymbolTable);
        try {
            SymbolTable.top.put(methodSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            MethodRedefinition methodRedefinition = new MethodRedefinition(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName());
            methodDeclaration.addError(methodRedefinition);
        }
        SymbolTable.push(methodSymbolTable);
        for(VariableDeclaration variableDeclaration : methodDeclaration.getArgs()) {
            variableDeclaration.accept(this);
        }
        for(VariableDeclaration variableDeclaration : methodDeclaration.getLocalVars()) {
            variableDeclaration.accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        try {
            SymbolTable.top.put(new FieldSymbolTableItem(fieldDeclaration));
        }
        catch (ItemAlreadyExistsException e) {
            FieldRedefinition fieldRedefinition = new FieldRedefinition(fieldDeclaration.getLine(), fieldDeclaration.getVarDeclaration().getVarName().getName());
            fieldDeclaration.addError(fieldRedefinition);
        }
        return null;
    }

    @Override
    public Void visit(VariableDeclaration varDeclaration) {
        try {
            SymbolTable.globalProgram.getItem(GlobalVariableSymbolTableItem.START_KEY + varDeclaration.getVarName().getName(), true);
            LocalVarConflictWithGlobalVar exceptionConflict = new LocalVarConflictWithGlobalVar(varDeclaration.getLine(), varDeclaration.getVarName().getName());
            varDeclaration.addError(exceptionConflict);
        }
        catch (ItemNotFoundException conflictWithGlobal) { //nested ya joda?
            try {
                SymbolTable.top.put(new LocalVariableSymbolTableItem(varDeclaration));
            }
            catch (ItemAlreadyExistsException e) {
                LocalVarRedefinition exception = new LocalVarRedefinition(varDeclaration.getLine(), varDeclaration.getVarName().getName());
                varDeclaration.addError(exception);
            }
        }
        return null;
    }
}
