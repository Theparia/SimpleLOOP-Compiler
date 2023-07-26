package main.visitor.name.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.compileError.nameError.ClassInCyclicInheritance;
import main.compileError.nameError.FieldRedefinition;
import main.compileError.nameError.MethodNameConflictWithField;
import main.compileError.nameError.MethodRedefinition;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.FieldSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.utils.graph.Graph;
import main.symbolTable.utils.graph.exceptions.GraphDoesNotContainNodeException;
import main.symbolTable.utils.graph.exceptions.NodeAlreadyExistsException;
import main.visitor.Visitor;

import java.util.ArrayList;


public class NameAnalyzer extends Visitor<Void> {
    private String thisClassDeclarationName;
    private Program program;
    private Graph<String> classGraph;
    private ArrayList<String> temp = new ArrayList<String >();
    Program globalProgram;

    public NameAnalyzer(Program program) {
        this.program = program;
        this.createInheritanceRelation();
    }

    private SymbolTable getClassSymbolTable() {
        try {
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.globalProgram.getItem(ClassSymbolTableItem.START_KEY + this.thisClassDeclarationName, true);
            return classSymbolTableItem.getClassSymbolTable();
        }
        catch (ItemNotFoundException itemNotFoundException) {
            return null;
        }
    }

    @Override
    public Void visit(Program program) {
        this.globalProgram = program;
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.thisClassDeclarationName = classDeclaration.getClassName().getName();
            this.temp.add(thisClassDeclarationName);
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        if(classDeclaration.getParentClassName() != null) {
            if (this.classGraph.isSecondNodeAncestorOf(classDeclaration.getParentClassName().getName(), classDeclaration.getClassName().getName())) {
                ClassInCyclicInheritance exception = new ClassInCyclicInheritance(classDeclaration.getLine(), classDeclaration.getClassName().getName());
                classDeclaration.addError(exception);
            }
        }
        if(classDeclaration.getFields() != null) {
            for (FieldDeclaration fieldDeclaration : classDeclaration.getFields()) {
                fieldDeclaration.accept(this);
            }
        }
        if(classDeclaration.getConstructor() != null) {
            classDeclaration.getConstructor().accept(this);
        }
        if(classDeclaration.getMethods() != null) {
            for (MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
                methodDeclaration.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        if(!fieldDeclaration.hasError()) {
            try {
                SymbolTable classSymbolTable = this.getClassSymbolTable();
                classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
                FieldRedefinition fieldRedefinition = new FieldRedefinition(fieldDeclaration.getLine(), fieldDeclaration.getVarDeclaration().getVarName().getName());
                fieldDeclaration.addError(fieldRedefinition);
            }
            catch (ItemNotFoundException itemNotFoundException) {
            }
        }
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        if(!methodDeclaration.hasError()) {
            try {
                SymbolTable classSymbolTable = this.getClassSymbolTable();
                classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), false);
                MethodRedefinition exception = new MethodRedefinition(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName());
                methodDeclaration.addError(exception);
            }
            catch (ItemNotFoundException itemNotFoundException) {
            }
        }
        try {
            SymbolTable classSymbolTable = this.getClassSymbolTable();
            classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), true);
            MethodNameConflictWithField methodNameConflictWithField = new MethodNameConflictWithField(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName());
            methodDeclaration.addError(methodNameConflictWithField);
        }
        catch (ItemNotFoundException itemNotFoundException) {
            for (ClassDeclaration classDeclaration : globalProgram.getClasses()) {
                String childName = classDeclaration.getClassName().getName();
                if (classGraph.isSecondNodeAncestorOf(childName, thisClassDeclarationName)) {
                    try {
                        ClassSymbolTableItem child = (ClassSymbolTableItem) SymbolTable.globalProgram.getItem(ClassSymbolTableItem.START_KEY + childName, true);
                        SymbolTable childSymbolTable = child.getClassSymbolTable();
                        childSymbolTable.getItem(FieldSymbolTableItem.START_KEY + methodDeclaration.getMethodName().getName(), true);
                        MethodNameConflictWithField exception = new MethodNameConflictWithField(methodDeclaration.getLine(), methodDeclaration.getMethodName().getName());
                        methodDeclaration.addError(exception);
                        break;
                    }
                    catch (ItemNotFoundException itemNotFoundException1) {
                    }
                }
            }
        }
        return null;
    }

    private void createInheritanceRelation() {
        Graph<String> graph = new Graph<>();
        for (ClassDeclaration classDeclaration : this.program.getClasses()) {
            String className = classDeclaration.getClassName().getName();
            try {
                graph.addNode(className);
            }
            catch (NodeAlreadyExistsException nodeAlreadyExistsException) {

            }
            if (classDeclaration.getParentClassName() != null)
            {
                String parentName = classDeclaration.getParentClassName().getName();
                try {
                    graph.addNodeAsParentOf(className, parentName);
                    ClassSymbolTableItem parentClassSymbolTableItem  = (ClassSymbolTableItem) SymbolTable.globalProgram.getItem(ClassSymbolTableItem.START_KEY + parentName, true);
                    ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) SymbolTable.globalProgram.getItem(ClassSymbolTableItem.START_KEY + className, true);
                    classSymbolTableItem.getClassSymbolTable().pre = parentClassSymbolTableItem.getClassSymbolTable();
                }
                catch (Exception e) {

                }
            }
        }
        this.classGraph = graph;
    }


}
