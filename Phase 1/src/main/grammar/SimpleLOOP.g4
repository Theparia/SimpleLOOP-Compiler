grammar SimpleLOOP;


simpleLOOP
    : globalSection NewLine* classSection
    ;

globalSection
    : (NewLine* variableDeclaration)*
    ;


//simpleLOOP
//    : NewLine* globalSection NewLine+ classSection NewLine*
//    ;
//
//globalSection
//    : (variableDeclaration NewLine+)* variableDeclaration?
//    ;

classSection
    : (classDeclaration)*
    ;


classDeclaration
    : Class className = ClassIndentifier {System.out.println("ClassDec : " + $className.text);} (Less parent = ClassIndentifier {System.out.println("Inheritance : " + $className.text + " < " + $parent.text);})? NewLine* LeftCurlyBracket NewLine+ classBody RightCurlyBracket NewLine+
    | Class className = ClassIndentifier {System.out.println("ClassDec : " + $className.text);} (Less parent = ClassIndentifier {System.out.println("Inheritance : " + $className.text + " < " + $parent.text);})? NewLine+ (classVariable NewLine+ | classMethod NewLine+ | )
    ;

classBody
    : (classVariable NewLine+ | classMethod)*
    ;

classVariable
    : (Private | Public) variableDeclaration
    ;

classMethod
    : (Private | Public) (type | Void) methodName = Identifier {System.out.println("MethodDec : " + $methodName.text);} LeftParenthesis methodDeclarationArguments RightParenthesis scope
    | Public Initialize LeftParenthesis methodDeclarationArguments RightParenthesis scope
    ;

scope
    : multiStatements
    | singleStatement
    ;

multiStatements
    : NewLine* LeftCurlyBracket NewLine+ (statement)* RightCurlyBracket NewLine+
    ;

singleStatement
    : NewLine+ statement
    ;

ifStatement
    : If {System.out.println("Conditional : if");} expression scope (Elsif {System.out.println("Conditional : elsif");} expression scope)* (Else {System.out.println("Conditional : else");} scope)?
    ;

returnStatement
    : Return {System.out.println("Return");} expression
    ;

iterativeStatement
    : (Identifier | (LeftParenthesis expression Dot Dot expression RightParenthesis)) Dot Each {System.out.println("Loop : each");} Do Bar Identifier Bar scope
    ;


statement
    : variableDeclaration NewLine+
    | ifStatement Semicolon? NewLine+
    | iterativeStatement Semicolon? NewLine+
    | returnStatement Semicolon? NewLine+
    | printStatement Semicolon? NewLine+
    | methodCallStatement Semicolon? NewLine+
    | assignStatement Semicolon? NewLine+
    | mergeStatement Semicolon? NewLine+
    | addStatement Semicolon? NewLine+
    | deleteStatement Semicolon? NewLine+
    | unaryExpression Semicolon? NewLine+
    ;

methodArguments
    : (expression (Comma expression)*)?
    ;

methodCallStatement
    : ternaryExpression {System.out.println("MethodCall");} LeftParenthesis methodArguments RightParenthesis
    ;

mergeStatement
    : expression Dot Merge {System.out.println("MERGE");} LeftParenthesis methodArguments RightParenthesis
    ;

addStatement
    : expression Dot Add {System.out.println("ADD");} LeftParenthesis expression RightParenthesis
    ;

deleteStatement
    : expression Dot Delete {System.out.println("DELETE");} LeftParenthesis expression RightParenthesis
    ;

printStatement
    : Print {System.out.println("Built-in : print");} LeftParenthesis expression RightParenthesis
    ;

methodDeclarationArguments
    : singleMethodArgument Assign expression (Comma singleMethodArgument Assign expression)*
    | singleMethodArgument (Comma singleMethodArgument)* (Comma singleMethodArgument Assign expression)*
    |
    ;

singleMethodArgument
    : type argumentName = Identifier {System.out.println("ArgumentDec : " + $argumentName.text);}
    ;

variableDeclaration
    : type identifiers (Semicolon)?
    ;

identifiers
    : varName = Identifier {System.out.println("VarDec : " + $varName.text);} (Comma varName = Identifier {System.out.println("VarDec : " + $varName.text);})*
    ;

type
    : Int
    | Bool
    | ClassIndentifier
    | arrayType
    | fptrType
    | setType
    ;

arrayType
    : (Int | Bool | ClassIndentifier) (LeftBracket expression RightBracket)+
    ;

fptrType
    : Fptr Less (Void | type (Comma type)*) Arrow (Void | type) Greater
    ;

setType
    : Set Less Int Greater
    ;

assignStatement :
    ternaryExpression Assign expression {System.out.println("Operator : =");};

expression:
    ternaryExpression (op = Assign expression {System.out.println("Operator : =");})? ;

assignExpression
    : ternaryExpression Assign assignExpression {System.out.println("Operator : =");}
    | ternaryExpression
    ;

ternaryExpression
    : logicalOrExpression Ternary ternaryExpression Colon ternaryExpression {System.out.println("Operator : ?:");}
    | logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (Or logicalAndExpression {System.out.println("Operator : ||");})*
    ;

logicalAndExpression
    : equalityExpression (And equalityExpression {System.out.println("Operator : &&");})*
    ;

equalityExpression
    : relationalExpression (Equals relationalExpression {System.out.println("Operator : ==");})*
    ;

relationalExpression
    : additiveExpression (r = (Less | Greater) additiveExpression {System.out.println("Operator : " + $r.text);})*
    ;

additiveExpression
    : multiplicativeExpression (r = (Plus | Minus) multiplicativeExpression {System.out.println("Operator : " + $r.text);})*
    ;

multiplicativeExpression
    : notExpression (r = (Multiply | Division) notExpression {System.out.println("Operator : " + $r.text);})*
    ;

notExpression
    : r = (Minus | Not) notExpression {System.out.println("Operator : " + $r.text);}
    | unaryExpression
    ;

unaryExpression
    : unaryExpression r = (PlusPlus | MinusMinus) {System.out.println("Operator : " + $r.text);}
    | accessExpression
    ;

accessExpression
    : values ((LeftParenthesis methodArguments RightParenthesis) | (defaultExpressions) | (Dot (Initialize | Identifier)) | (LeftBracket expression RightBracket))*
    ;


defaultExpressions
    : (Dot New {System.out.println("NEW");} | Dot Include {System.out.println("INCLUDE");}) LeftParenthesis methodArguments RightParenthesis
    ;

values
    : LeftParenthesis methodArguments RightParenthesis
    | IntLiteral
    | BoolLiteral
    | Self
    | Set
    | ClassIndentifier
    | Identifier
    ;




//keywords
Private: 'private';
Public: 'public';
Int: 'int';
Bool: 'bool';
BoolLiteral: 'true'| 'false';
IntLiteral: [1-9] [0-9]* | [0];
Class: 'class';
Fptr: 'fptr';
Set: 'Set';
Comma: ',';
Void: 'void';
If: 'if';
Elsif: 'elsif';
Else: 'else';
Self: 'self';
Print:'print';
Add: 'add';
Merge: 'merge';
Include: 'include';
Delete: 'delete';
New: 'new';
Initialize: 'initialize';
Return: 'return';
Each: 'each';
Do: 'do';
Bar: '|';
LeftBracket: '[';
RightBracket: ']';
LeftParenthesis: '(';
RightParenthesis: ')';
LeftCurlyBracket: '{';
RightCurlyBracket: '}';
Assign: '=';
Plus: '+';
Minus: '-';
Multiply: '*';
Division: '/';
PlusPlus: '++';
MinusMinus: '--';
Ternary: '?';
Colon: ':';
Not: '!';
And: '&&';
Or: '||';
Equals: '==';
Dot: '.';
Arrow: '->';
NewLine: [\n\r];
Less: '<';
Greater: '>';
Semicolon: ';';
ClassIndentifier: [A-Z][a-zA-Z0-9_]*;
Identifier: [a-z_][a-zA-Z0-9_]*;

//Skips
Comment: '#' (~[\r\n])*  -> skip;
MultilineComment: '=begin' (.)*? '=end' -> skip;
WS: [ \t] -> skip;
FloorDivision: '//' .*? '\n' -> skip;
