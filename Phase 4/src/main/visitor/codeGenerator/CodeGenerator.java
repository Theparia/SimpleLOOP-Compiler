package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VariableDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.Value;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.EachStmt;
import main.ast.types.NullType;
import main.ast.types.Type;
import main.ast.types.array.ArrayType;
import main.ast.types.functionPointer.FptrType;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.ClassType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.symbolTable.utils.graph.Graph;
import main.util.ArgPair;
import main.visitor.Visitor;
import main.visitor.typeChecker.ExpressionTypeChecker;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker;
    Graph<String> classHierarchy;
    private String outputPath;
    private FileWriter currentFile;
    private ClassDeclaration currentClass;
    private MethodDeclaration currentMethod;
    private int numberOfTemps;
    private int numberOfLabels;
    String nextElseLabel;
    private ArrayList<VariableDeclaration> globalVariables;
    MethodDeclaration currentMethodCallDeclaration;

    public CodeGenerator(Graph<String> classHierarchy) {
        this.globalVariables = new ArrayList<>();
        this.classHierarchy = classHierarchy;
        this.expressionTypeChecker = new ExpressionTypeChecker(classHierarchy);
        this.prepareOutputFolder();
        this.numberOfTemps = 0;
        this.numberOfLabels = 0;
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String arrayClassPath = "utilities/codeGenerationUtilityClasses/Array.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {
            e.printStackTrace();
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(arrayClassPath, this.outputPath + "Array.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(path);
            this.currentFile = fileWriter;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier){
        int count = 1;
        for(ArgPair argPair : currentMethod.getArgs()){
            if(argPair.getVariableDeclaration().getVarName().getName().equals(identifier))
                return count;
            count++;
        }
        for(VariableDeclaration variableDeclaration : currentMethod.getLocalVars()) {
            if(variableDeclaration.getVarName().getName().equals(identifier))
                return count;
            count++;
        }
        if (identifier.equals("")){
            return count + numberOfTemps++;
        }
        return 0;
    }

    private void addDefaultConstructor(){
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload 0");
        if(currentClass.getParentClassName() == null)
            addCommand("invokespecial java/lang/Object/<init>()V");
        else
            addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
        for(FieldDeclaration fieldDeclaration : currentClass.getFields()){
            this.initializeField(fieldDeclaration.getVarDeclaration(), true, null);
            addCommand("putfield " + this.currentClass.getClassName().getName() + "/" + fieldDeclaration.getVarDeclaration().getVarName().getName() + " " + makeTypeSignature(fieldDeclaration.getVarDeclaration().getType()));
        }
        addCommand("return");
        addCommand(".end method\n");
    }


    private String initilizeArrayElement(Type t) {
        String command = "";
        if (t instanceof IntType) {
            command += "ldc 0\n";
            command += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
        } else if (t instanceof BoolType) {
            command += "ldc 0\n";
            command += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
        } else if (t instanceof ClassType || t instanceof FptrType)
            command += "aconst_null\n";
        return command;
    }

    private void initializeField(VariableDeclaration variableDeclaration, boolean isField, Expression defaultValue){
        Type fieldType = variableDeclaration.getType();
        String commands = "";
        String fieldName = variableDeclaration.getVarName().getName();
        if(isField)
            addCommand("aload 0");
        if(fieldType instanceof IntType){
            if(defaultValue == null)
                addCommand(this.visit(new IntValue(0)));
            else
                addCommand(this.visit((IntValue) defaultValue));
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        }
        else if(fieldType instanceof BoolType) {
            if(defaultValue == null)
                addCommand(this.visit(new BoolValue(false)));
            else
                addCommand(this.visit((BoolValue) defaultValue));
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }
        else if(fieldType instanceof ClassType){
            if(defaultValue == null)
                addCommand(this.visit(new NullValue()));
            else
                addCommand(this.visit((Identifier) defaultValue));
        }
        else if(fieldType instanceof FptrType){
            if(defaultValue == null)
                addCommand(this.visit(new NullValue()));
            else
                addCommand(this.visit((MethodCall) defaultValue));
        }
        else if (fieldType instanceof ArrayType){
            for (Expression e : ((ArrayType) fieldType).getDimensions()){
                addCommand("new Array");
                addCommand("dup");
                addCommand(e.accept(this));
            }
            addCommand(initilizeArrayElement(((ArrayType) variableDeclaration.getType()).getType()));
            for(int i=0 ; i < ((ArrayType) variableDeclaration.getType()).getDimensions().size(); i++) {
                addCommand("invokespecial Array/<init>(ILjava/lang/Object;)V");
            }
        }
        else if(fieldType instanceof NullType)
            addCommand(this.visit(new NullValue()));
//        addCommand("putfield " + currentClass.getClassName().getName() + "/" + fieldName + " " + makeTypeSignature(fieldType));
    }


    private VariableDeclaration getGlobalVariable(Identifier identifier){
        for(VariableDeclaration globalVar : this.globalVariables){
            if(globalVar.getVarName().getName().equals(identifier.getName())){
                return  globalVar;
            }
        }
        return null;
    }

    private String getClass(Type t) {
        if(t instanceof ArrayType)
            return "Array";
        else if(t instanceof IntType)
            return "java/lang/Integer";
        else if(t instanceof FptrType)
            return "Fptr";
        else if(t instanceof BoolType)
            return "java/lang/Boolean";
        else if(t instanceof ClassType){
            return ((ClassType) t).getClassName().getName();
        }
        return "";
    }
    private String makeTypeSignature(Type type) {
        if(type instanceof IntType)
            return "Ljava/lang/Integer;";
        else if(type instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if(type instanceof ArrayType)
            return "LArray;";
        else if(type instanceof FptrType)
            return "LFptr;";
        else if(type instanceof ClassType)
            return "L" + ((ClassType) type).getClassName().getName() + ";";
        else
            return "V";
    }

    private String getFreshLabel() {
        return "Label_" + this.numberOfLabels++;
    }

    @Override
    public String visit(Program program) {
        if(program.getGlobalVariables().size() > 0) {
            createFile("Global");
            addCommand(".class public " + "Global");
            addCommand(".super java/lang/Object");
            ClassDeclaration globalClassDeclaration = new ClassDeclaration(new Identifier("Global"));
            this.globalVariables.addAll(program.getGlobalVariables());
//            System.out.println(globalVariables.size());
            for (VariableDeclaration globalVariableDeclaration : program.getGlobalVariables()) {
                String globalVarName = globalVariableDeclaration.getVarName().getName();
                Type globalVarType = globalVariableDeclaration.getType();
                addCommand(".field static " + globalVarName + " " + makeTypeSignature(globalVarType));
                globalClassDeclaration.addField(new FieldDeclaration(globalVariableDeclaration, false));
            }
            this.currentClass = globalClassDeclaration;
            this.expressionTypeChecker.setCurrentClass(globalClassDeclaration);
            addCommand(".method public <init>()V");
            addCommand(".limit stack 128");
            addCommand(".limit locals 128");
            addCommand("aload 0");
            addCommand("invokespecial java/lang/Object/<init>()V");
            for(VariableDeclaration globalVariableDeclaration : program.getGlobalVariables()){
                this.initializeField(globalVariableDeclaration, true, null);
                addCommand("putstatic " + currentClass.getClassName().getName() + "/" + globalVariableDeclaration.getVarName().getName() + " " + makeTypeSignature(globalVariableDeclaration.getType()));
            }
            addCommand("return");
            addCommand(".end method\n");
        }
        for(ClassDeclaration classDeclaration : program.getClasses()) {
            this.expressionTypeChecker.setCurrentClass(classDeclaration);
            this.currentClass = classDeclaration;
            classDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ClassDeclaration classDeclaration) {
        String className = classDeclaration.getClassName().getName();
        createFile(className);
        addCommand(".class public " + className);
        if(classDeclaration.getParentClassName() == null)
            addCommand(".super java/lang/Object");
        else
            addCommand(".super " + classDeclaration.getParentClassName().getName());
        for(FieldDeclaration fieldDeclaration : classDeclaration.getFields())
            fieldDeclaration.accept(this);
        if(classDeclaration.getConstructor() != null) {
            this.currentMethod = classDeclaration.getConstructor();
            this.expressionTypeChecker.setCurrentMethod(classDeclaration.getConstructor());
            classDeclaration.getConstructor().accept(this);
        }
        else
            addDefaultConstructor();
        for(MethodDeclaration methodDeclaration : classDeclaration.getMethods()) {
            this.currentMethod = methodDeclaration;
            this.expressionTypeChecker.setCurrentMethod(methodDeclaration);
            methodDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(ConstructorDeclaration constructorDeclaration) {
        if(constructorDeclaration.getArgs().size() > 0)
            this.addDefaultConstructor();
        if (this.currentClass.getClassName().getName().equals("Main"))
            this.addStaticMainMethod();
        this.visit((MethodDeclaration) constructorDeclaration);
        return null;
    }

    @Override
    public String visit(MethodDeclaration methodDeclaration) {
        String signatures = "";
        for(ArgPair argPair : methodDeclaration.getArgs()) {
            signatures += makeTypeSignature(argPair.getVariableDeclaration().getType());
        }
        if(methodDeclaration instanceof ConstructorDeclaration)
            addCommand(".method public <init>(" + signatures + ")V");
        else {
            addCommand(".method public " + methodDeclaration.getMethodName().getName() + "(" + signatures + ")" + makeTypeSignature(methodDeclaration.getReturnType()));
        }
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        if(methodDeclaration instanceof ConstructorDeclaration) {
            addCommand("aload 0");
            if(currentClass.getParentClassName() == null)
                addCommand("invokespecial java/lang/Object/<init>()V");
            else
                addCommand("invokespecial " + currentClass.getParentClassName().getName() + "/<init>()V");
            for (FieldDeclaration fieldDeclaration : currentClass.getFields()) {
                this.initializeField(fieldDeclaration.getVarDeclaration(), true, null);
                addCommand("putfield " + currentClass.getClassName().getName() + "/" + fieldDeclaration.getVarDeclaration().getVarName().getName() + " " + makeTypeSignature(fieldDeclaration.getVarDeclaration().getType()));
            }
        }
        for(VariableDeclaration localVar : methodDeclaration.getLocalVars())
            localVar.accept(this);
        for(Statement statement : methodDeclaration.getBody())
            statement.accept(this);
        if(!this.currentMethod.getDoesReturn())
            addCommand("return");
        addCommand(".end method\n ");
        this.numberOfTemps = 0;
        return null;
    }

    @Override
    public String visit(FieldDeclaration fieldDeclaration) {
        String fieldName = fieldDeclaration.getVarDeclaration().getVarName().getName();
        Type fieldType = fieldDeclaration.getVarDeclaration().getType();
        addCommand(".field " + fieldName + " " + makeTypeSignature(fieldType));
        return null;
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        VariableDeclaration globalVar = getGlobalVariable(variableDeclaration.getVarName());
        if(globalVar == null) {
            this.initializeField(variableDeclaration, false, null);
            addCommand("astore " + slotOf(variableDeclaration.getVarName().getName()));
        }
        else {
            this.initializeField(variableDeclaration, true, null);
            addCommand("putstatic Global/" + globalVar.getVarName().getName() + " " + makeTypeSignature(globalVar.getType()));
        }
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        BinaryExpression assignExpression = new BinaryExpression(assignmentStmt.getlValue(), assignmentStmt.getrValue(), BinaryOperator.assign);
        addCommand(this.visit(assignExpression));
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        ArrayList<String> elsifLabels = new ArrayList<>();
        for(int i = 0; i < conditionalStmt.getElsif().size(); i++){
            elsifLabels.add(getFreshLabel());
        }
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        addCommand(conditionalStmt.getCondition().accept(this));
        if(elsifLabels.size() > 0)
            addCommand("ifeq " + elsifLabels.get(0));
        else
            addCommand("ifeq " + elseLabel);
        conditionalStmt.getThenBody().accept(this);
        addCommand("goto " + exitLabel);
        for(int i = 0; i < conditionalStmt.getElsif().size(); i++){
            addCommand(elsifLabels.get(i) + ":");
            if(i != conditionalStmt.getElsif().size()-1)
                this.nextElseLabel =  elsifLabels.get(i + 1);
            else
                this.nextElseLabel = elseLabel;
            conditionalStmt.getElsif().get(i).accept(this);
            addCommand("goto " + exitLabel);
        }
        addCommand(elseLabel + ":");
        if(conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(exitLabel + ":");
        return null;
    }


    @Override
    public String visit(ElsifStmt elsifStmt) {
        addCommand(elsifStmt.getCondition().accept(this));
        addCommand("ifeq " + this.nextElseLabel);
        elsifStmt.getThenBody().accept(this);
        return null;
    }

    @Override
    public String visit(MethodCallStmt methodCallStmt) {
        expressionTypeChecker.setIsInMethodCallStmt(true);
        addCommand(methodCallStmt.getMethodCall().accept(this));
        expressionTypeChecker.setIsInMethodCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(PrintStmt print) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        addCommand(print.getArg().accept(this));
        Type type = print.getArg().accept(expressionTypeChecker);
        if (type instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        else if(type instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");
//        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
//        addCommand("ldc \"\\r\\n\"");
//        addCommand("invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V");
        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof NullType || type instanceof VoidType) {
            addCommand("return");
        }
        else {
            addCommand( returnStmt.getReturnedExpr().accept(this) );
            if(type instanceof IntType)
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            if(type instanceof BoolType)
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(EachStmt eachStmt) {
        String startLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        int temp = slotOf("");
        String listCommands = eachStmt.getList().accept(this);
        addCommand("ldc 0");
        addCommand("istore " + temp);

        addCommand(startLabel + ":");
        addCommand("iload " + temp);
        addCommand(listCommands);
        addCommand("getfield Array/elements Ljava/util/ArrayList;");
        addCommand("invokevirtual java/util/ArrayList/size()I");
        addCommand("if_icmpge " + exitLabel);

        addCommand(listCommands);
        addCommand("iload " + temp);
        addCommand("invokevirtual Array/getElement(I)Ljava/lang/Object;");
        addCommand("checkcast " + getClass(eachStmt.getVariable().accept(expressionTypeChecker)));
        VariableDeclaration globalVar = getGlobalVariable(eachStmt.getVariable());
        if(globalVar == null)
            addCommand("astore " + slotOf(eachStmt.getVariable().getName()));
        else
            addCommand("putstatic Global/" + globalVar.getVarName().getName() + " " + makeTypeSignature(globalVar.getType()));
        addCommand("iinc " + temp + " 1");

        eachStmt.getBody().accept(this);
        addCommand("goto " + startLabel);
        addCommand(exitLabel + ":");
        return null;
    }

    @Override
    public String visit(TernaryExpression ternaryExpression) {
        String commands = "";
        String elseLabel = getFreshLabel();
        String exitLabel = getFreshLabel();
        commands += ternaryExpression.getCondition().accept(this);
        commands +="\nifeq " + elseLabel + "\n";
        commands += ternaryExpression.getTrueExpression().accept(this);
        commands +="\ngoto " + exitLabel + "\n";
        commands += elseLabel + ":\n";
        commands += ternaryExpression.getFalseExpression().accept(this);
        commands += "\n" + exitLabel + ":\n";
        return commands;
    }

    @Override
    public String visit(RangeExpression rangeExpression) {
        String  commands = "";
        commands += "new Array\n";
        commands += "dup\n";
        commands += rangeExpression.getLeftExpression().accept(this);
//        commands += "\ninvokevirtual java/lang/Integer/intValue()I\n";
        commands +=  rangeExpression.getRightExpression().accept(this);
//        commands += "\ninvokevirtual java/lang/Integer/intValue()I\n";
        commands += "invokespecial Array/<init>(II)V\n";
        return commands;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) { //assign, eq, gt, lt, add, sub, mult, div, and, or
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";
        if(!((operator == BinaryOperator.assign) || (operator == BinaryOperator.and) || (operator == BinaryOperator.or))) {
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
        }
        if (operator == BinaryOperator.add)
            commands += "iadd\n";
        else if (operator == BinaryOperator.sub)
            commands += "isub\n";
        else if (operator == BinaryOperator.mult)
            commands += "imul\n";
        else if (operator == BinaryOperator.div)
            commands += "idiv\n";
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String nTrue = getFreshLabel();
            String nAfter = getFreshLabel();
            String command = (operator == BinaryOperator.lt) ? "if_icmplt " : "if_icmpgt ";
            commands += command + nTrue + "\n";
            commands += "ldc 0" + "\n";
            commands += "goto " + nAfter + "\n";
            commands += nTrue + ":\n";
            commands += "ldc 1\n";
            commands += nAfter + ":";
        }
        else if((operator == BinaryOperator.eq)) {
            Type type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String falseLabel = getFreshLabel();
            String exitLabel = getFreshLabel();
            String compareCommand = "";
            if((type instanceof IntType) || (type instanceof BoolType))
                compareCommand += "if_icmpne ";
            else
                compareCommand +="if_acmpne ";
            commands += compareCommand + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + exitLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += exitLabel + ":";
        }
        else if(operator == BinaryOperator.or) {
            String trueLabel = getFreshLabel();
            String endLabel = getFreshLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifne " + trueLabel + "\n";
            commands += "ldc 0\n";
            commands += "goto " + endLabel + "\n";
            commands += trueLabel + ":\n";
            commands += "ldc 1\n";
            commands += endLabel + ":";
        }
        else if(operator == BinaryOperator.and) {
            String nElseLabel = getFreshLabel();
            String nAfterLabel = getFreshLabel();
            commands += binaryExpression.getFirstOperand().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += binaryExpression.getSecondOperand().accept(this) + "\n";
            commands += "ifeq " + nElseLabel + "\n";
            commands += "ldc 1\n";
            commands += "goto " + nAfterLabel + "\n";
            commands += nElseLabel + ":\n";
            commands += "ldc 0\n";
            commands += nAfterLabel + ":";
        }
        else if(operator == BinaryOperator.assign) {
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            String secondCommands = binaryExpression.getSecondOperand().accept(this);
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                commands += secondCommands + "\n";
                commands += "dup\n";
                if(firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                int varSlot = slotOf(((Identifier) binaryExpression.getFirstOperand()).getName());
                VariableDeclaration globalVar = getGlobalVariable((Identifier) binaryExpression.getFirstOperand());
                if(globalVar == null)
                    commands += "astore " + varSlot + "\n";
                else{
                    commands += "putstatic Global/" + globalVar.getVarName().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
//                    System.out.println("BINARY ELSE: "+globalVar.getVarName().getName());
                }
            }
            else if (binaryExpression.getFirstOperand() instanceof ArrayAccessByIndex) {
                commands += ((ArrayAccessByIndex) binaryExpression.getFirstOperand()).getInstance().accept(this) + "\n";
                commands += ((ArrayAccessByIndex) binaryExpression.getFirstOperand()).getIndex().accept(this) + "\n";
                commands += secondCommands + "\n";
                commands += "dup_x2\n";
                if (firstType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if (firstType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
            }
            else if(binaryExpression.getFirstOperand() instanceof ObjectMemberAccess) {
                Expression instance = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getInstance();
                Type memberType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectMemberAccess) binaryExpression.getFirstOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if (instanceType instanceof ClassType) {
                    String className = ((ClassType) instanceType).getClassName().getName();
                    commands += instance.accept(this) + "\n";
                    commands += secondCommands + "\n";
                    commands += "dup_x1\n";
                    if(firstType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(firstType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    commands += "putfield " + className + "/" + memberName + " " + makeTypeSignature(memberType) + "\n";
//                    commands += binaryExpression.getFirstOperand().accept(this);
                }
                else if (instanceType instanceof ArrayType){
                    for (Expression e : ((ArrayType) memberType).getDimensions()){
                        commands += "e.accept(this)\n";
                    }
                    commands += secondCommands + "\n";
                    commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
                }
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        UnaryOperator operator = unaryExpression.getOperator();
        String commands = "";
        if(operator == UnaryOperator.minus) {
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ineg";
        }
        else if(operator == UnaryOperator.not) {
            String falseLabel = getFreshLabel();
            String afterLabel = getFreshLabel();
            commands += unaryExpression.getOperand().accept(this) + "\n";
            commands += "ifne " + falseLabel + "\n";
            commands += "ldc 1" + "\n";
            commands += "goto " + afterLabel + "\n";
            commands += falseLabel + ":\n";
            commands += "ldc 0\n";
            commands += afterLabel + ":";
        }
        else if((operator == UnaryOperator.postinc) || (operator == UnaryOperator.postdec)) {
            if(unaryExpression.getOperand() instanceof Identifier) {
                Identifier identifier = (Identifier)unaryExpression.getOperand();
                VariableDeclaration globalVar = getGlobalVariable(identifier);
                int slot = slotOf(identifier.getName());
                if(globalVar == null)
                    commands += "aload " + slot + "\n";
                else
                    commands += "getstatic Global/" + identifier.getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup\n";
                commands += "ldc 1\n";
                if (operator == UnaryOperator.postinc)
                    commands += "iadd\n";
                else
                    commands += "isub\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";

                if(globalVar == null) {
//                    System.out.println("ASTORE");
                    commands += "astore " + slot + "\n";
                }
                else {
                    commands += "putstatic Global/" + globalVar.getVarName().getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
//                    System.out.println("PUTSTATIC");
                }
//                commands += "astore " + slot + "\n";
            }
            else if(unaryExpression.getOperand() instanceof ObjectMemberAccess) {
                Expression instance = ((ObjectMemberAccess) unaryExpression.getOperand()).getInstance();
                Type memberType = unaryExpression.getOperand().accept(expressionTypeChecker);
                String memberName = ((ObjectMemberAccess) unaryExpression.getOperand()).getMemberName().getName();
                Type instanceType = instance.accept(expressionTypeChecker);
                if(instanceType instanceof ClassType) {
                    String className = ((ClassType)instanceType).getClassName().getName();
                    commands += instance.accept(this);
                    commands += "getfield " + className + "/" + memberName + " L" + getClass(memberType) + ";\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += instance.accept(this);
                    commands += "dup\n";
                    commands += "getfield " + className + "/" + memberName + " L" + getClass(memberType) + ";\n";
                    commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    commands += "ldc 1\n";
                    if (operator == UnaryOperator.postinc)
                        commands += "iadd\n";
                    else
                        commands += "isub\n";
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    commands += "putfield " + className + "/" + memberName + " L" + getClass(memberType) + ";\n";
                }
                else if (instanceType instanceof ArrayType){
                    for (Expression e : ((ArrayType) memberType).getDimensions()){
                        commands += e.accept(this);
                    }
//                    commands += secondCommands + "\n";
                    commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
                }
            }
            else if(unaryExpression.getOperand() instanceof ArrayAccessByIndex) {
                commands += ((ArrayAccessByIndex) unaryExpression.getOperand()).getInstance().accept(this) + "\n";
                commands +=  ((ArrayAccessByIndex) unaryExpression.getOperand()).getIndex().accept(this) + "\n";
                commands += "dup2\n";
                commands += "invokevirtual Array/getElement(I)Ljava/lang/Object;\n";
                commands += "checkcast java/lang/Integer\n";
                commands += "invokevirtual java/lang/Integer/intValue()I\n";
                commands += "dup_x2\n";
                commands += "ldc 1\n";
                if(operator == UnaryOperator.postdec)
                    commands += "isub\n";
                else
                    commands += "iadd\n";
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                commands += "invokevirtual Array/setElement(ILjava/lang/Object;)V\n";
            }
        }
        return commands;
    }

    @Override
    public String visit(ObjectMemberAccess objectMemberAccess) {
        Type memberType = objectMemberAccess.accept(expressionTypeChecker);
        Type instanceType = objectMemberAccess.getInstance().accept(expressionTypeChecker);
        String memberName = objectMemberAccess.getMemberName().getName();
        String commands = "";
        if(instanceType instanceof ClassType) {
            String className = ((ClassType) instanceType).getClassName().getName();
            try {
                SymbolTable classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + className, true)).getClassSymbolTable();
                try {
                    classSymbolTable.getItem(FieldSymbolTableItem.START_KEY + memberName, true);
                    commands += objectMemberAccess.getInstance().accept(this);
                    commands += "\ngetfield " + className + "/" + memberName + " L" + getClass(memberType) + ";\n";
                    if (memberType instanceof IntType)
                        commands += "invokevirtual java/lang/Integer/intValue()I\n";
                    if (memberType instanceof BoolType)
                        commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";

                } catch (ItemNotFoundException memberIsMethod) {
                    MethodSymbolTableItem methodSymbolTableItem = (MethodSymbolTableItem) classSymbolTable.getItem(MethodSymbolTableItem.START_KEY + memberName, true);
                    this.currentMethodCallDeclaration = methodSymbolTableItem.getMethodDeclaration();
                    commands += "new Fptr\n";
                    commands += "dup\n";
                    commands += objectMemberAccess.getInstance().accept(this);
                    commands += "\nldc \"" + memberName + "\"\n";
                    commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
                }
            } catch (ItemNotFoundException classNotFound) { // never reached
            }
        }
        return commands;
    }

    @Override
    public String visit(Identifier identifier) {
        String commands = "";
        VariableDeclaration globalVar = this.getGlobalVariable(identifier);
        Type type = identifier.accept(expressionTypeChecker);
        if(globalVar == null)
            commands += "aload " + slotOf(identifier.getName()) + "\n";
        else
            commands += "getstatic Global/" + identifier.getName() + " " + makeTypeSignature(globalVar.getType()) + "\n";
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I\n";
        else if(type instanceof  BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z\n";
        return commands;
    }

    @Override
    public String visit(ArrayAccessByIndex arrayAccessByIndex) {
        String commands = "";
        commands += arrayAccessByIndex.getInstance().accept(this) + "\n";
        commands += arrayAccessByIndex.getIndex().accept(this) + "\n";
        Type type = arrayAccessByIndex.accept(expressionTypeChecker);
        commands += "invokevirtual Array/getElement(I)Ljava/lang/Object;\n";
        commands += "checkcast " + getClass(type) + "\n";
        if(type instanceof IntType)
            commands += "\ninvokevirtual java/lang/Integer/intValue()I\n";
        else if(type instanceof BoolType)
            commands += "\ninvokevirtual java/lang/Boolean/booleanValue()Z\n";
        return commands;
    }

    @Override
    public String visit(MethodCall methodCall) {
        String commands = "";
        int temp = slotOf("");
        ArrayList<Expression> args = methodCall.getArgs();
        Type returnType = ((FptrType) methodCall.getInstance().accept(expressionTypeChecker)).getReturnType();
        commands += methodCall.getInstance().accept(this);
        commands += "\nnew java/util/ArrayList\n";
        commands += "dup\n";
        commands += "invokespecial java/util/ArrayList/<init>()V\n";
        commands += "astore " + temp + "\n";
        for(Expression arg : args){
            commands += "aload " + temp + "\n";
            Type argType = arg.accept(expressionTypeChecker);
            if(argType instanceof ArrayType) {
                commands += "new Array\n";
                commands += "dup\n";
            }
            commands += arg.accept(this);
            if(argType instanceof IntType)
                commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
            if(argType instanceof BoolType)
                commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
            if(argType instanceof ArrayType) {
                commands += "invokespecial Array/<init>(LArray;)V\n";
            }
            commands += "\ninvokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
            commands += "pop\n";
        }
        if(args.size() < this.currentMethodCallDeclaration.getArgs().size()){
            for(int i = this.currentMethodCallDeclaration.getArgs().size() - (this.currentMethodCallDeclaration.getArgs().size()-args.size()); i < this.currentMethodCallDeclaration.getArgs().size(); i++){
//                commands += this.initializeField(currentMethodCallDeclaration.getArgs().get(i).getVariableDeclaration(), false, currentMethodCallDeclaration.getArgs().get(i).getDefaultValue()) + "\n";
//                addCommand("astore " + slotOf(currentMethodCallDeclaration.getArgs().get(i).getVariableDeclaration().getVarName().getName()));
                commands += "aload " + temp + "\n";
                Type argType = this.currentMethodCallDeclaration.getArgs().get(i).getDefaultValue().accept(expressionTypeChecker);
                if(argType instanceof ArrayType) {
                    commands += "new Array\n";
                    commands += "dup\n";
                }
                commands += this.currentMethodCallDeclaration.getArgs().get(i).getDefaultValue().accept(this);
                if(argType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                if(argType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                if(argType instanceof ArrayType) {
                    commands += "invokespecial Array/<init>(LArray;)V\n";
                }
                commands += "\ninvokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n";
                commands += "pop\n";
            }
        }
        commands += "aload " + temp + "\n";
        commands += "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;\n";
        if(!(returnType instanceof NullType || returnType instanceof VoidType))
            commands += "checkcast " + getClass(returnType) + "\n";
        if (returnType instanceof IntType)
            commands += "invokevirtual java/lang/Integer/intValue()I\n";
        if (returnType instanceof BoolType)
            commands += "invokevirtual java/lang/Boolean/booleanValue()Z\n";
        return commands;
    }

    @Override
    public String visit(NewClassInstance newClassInstance) {
        String commands = "";
        String className = newClassInstance.getClassType().getClassName().getName();
        String signatures = "";
        commands += "new " + className + "\n";
        commands += "dup\n";
        ClassSymbolTableItem classSymbolTable;
        ConstructorDeclaration constructorDeclaration ;
        try {
            classSymbolTable = ((ClassSymbolTableItem) SymbolTable.root.getItem(ClassSymbolTableItem.START_KEY + newClassInstance.getClassType().getClassName().getName(), true));
            constructorDeclaration = classSymbolTable.getClassDeclaration().getConstructor();
            for(Expression arg : newClassInstance.getArgs()){
                commands += arg.accept(this);
                Type argType = arg.accept(expressionTypeChecker);
                if(argType instanceof IntType)
                    commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                else if(argType instanceof BoolType)
                    commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                signatures += makeTypeSignature(argType);
            }
            if(newClassInstance.getArgs().size() < constructorDeclaration.getArgs().size()){
                for(int i = constructorDeclaration.getArgs().size() - (constructorDeclaration.getArgs().size() - newClassInstance.getArgs().size()); i < constructorDeclaration.getArgs().size(); i++){
                    commands += constructorDeclaration.getArgs().get(i).getDefaultValue().accept(this);
                    Type argType = constructorDeclaration.getArgs().get(i).getDefaultValue().accept(expressionTypeChecker);
                    if(argType instanceof IntType)
                        commands += "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n";
                    else if(argType instanceof BoolType)
                        commands += "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n";
                    signatures += makeTypeSignature(argType);
                }
            }
        }
        catch(Exception ignored){
        }
        commands += "invokespecial " + className + "/<init>(" + signatures + ")V\n";
        return commands;
    }

    @Override
    public String visit(SelfClass selfClass) {
        String commands = "";
        commands += "aload_0\n";
        return commands;
    }

    @Override
    public String visit(NullValue nullValue) {
        String commands = "";
        commands += "aconst_null\n";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        commands += "ldc " + intValue.getConstant() + "\n";
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        String commands = "";
        if(boolValue.getConstant())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        return commands;
    }

}
