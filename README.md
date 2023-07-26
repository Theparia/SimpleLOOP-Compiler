# SimpleLOOP-Compiler

The language `SimpleLOOP` is an **object-oriented language** and has some features of object-oriented language such as **inheritance**. In this language, there is a `Main` class in which an `initialize` method is implemented. The programs written in this language execute the commands inside this method when they are executed.
## Phase 1 (Lexer)
* **Grammar** specification

## Phase 2 (Name Analysis)
* **Abstract Syntax Tree (AST)**
* **Errors**
  * Redefinition of class \<ClassName>
  * Redefinition of local variable \<VariableName>
  * Redefinition of field \<FieldName>
  * Redefinition of method \<MethodName>
  * Name of method \<MethodName> conflicts with a field's name
  * Redefinition of global variable \<VariableName>
  * Name of local variable \<VariableName> conflicts with a global variable’s name
  * Class \<ClassName> is in an inheritance cycle

## Phase 3 (Type-Checking)
* **Errors**
  * Variable \<VariableName> is not declared
  * Class \<ClassName> is not declared
  * There is no member named \<VariableName> in class \<ClassName>
  * Condition must be bool
  * Left side of the assignment must be a valid lvalue
  * Lvalue is required as the operand of <OperatorName>
  * Calling a non-callable
  * Unsupported type for print
  * ...

## Phase 4 (Code Generation)
* Program translation to **bytecode**
* Generate .class files using [jasmin](https://jasmin.sourceforge.net/) assembler

