# SimpleLOOP-Compiler

The language `SimpleLOOP` is an **object-oriented language** and has some features of object-oriented language such as **inheritance**. In this language, there is a `Main` class in which an `initialize` method is implemented. The programs written in this language execute the commands inside this method when they are executed.
## Phase 1 (Lexer)
* Grammar specification

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
  * Cannot have empty array
  * Cannot use return value of a method having void return type
  * Return value does not match with method return type
  * Args in method call do not match with definition
  * Constructor args do not match with definition of class \<ClassName>
  * Each cannot iterate over a non-array
  * Each range expression is not an integer
  * Each variable \<VarName> is not same type as range input
  * Access on a non-class
  * Access by index on a non-array
  * Array index is not an integer
  *  Merge on non-Set
  *  New on non-Set
  *  Set add method input is not an integer
  *  Set include method input is not an integer
  *  Main class not found
  *  Main class cannot inherit any class
  *  Classes cannot extend from Main class
  *  No constructor found for Main class
  *  Main constructor cannot have arguments
  *  Method \<MethodName> needs return statement
  *  Method \<MethodName> should not have a return statement
  *  Statements are unreachable

## Phase 4 (Code Generation)
