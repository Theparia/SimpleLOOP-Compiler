grammar SimpleLOOP;

//key words


simpleLOOP
    : globalSection NewLine+ classSection
    //NewLine* classSection
    ;

//global variables
globalSection
    : (globalVariable NewLine+)* globalVariable?
    ;

classSection
    : (classs NewLine*)*
    ;

classs
    : Class ClassIndentifier (Less ClassIndentifier)? LeftCurlyBracket NewLine+ classBody RightCurlyBracket NewLine
    ;

classBody
    : (classVariable NewLine+ | classMethod NewLine+)*
    ;

classVariable
    : (Private | Public) globalVariable
    ;

classMethod
    : (Private | Public) type Identifier LeftParenthesis arguments RightParenthesis
    ;

statement
    :
    ;

arguments
    : argument (Comma argument)* (Comma argument Assign (BoolLiteral | IntLiteral))*
    |
    ;

argument
    : type Identifier
    ;




globalVariable
    : type identifiers (Semicolon)?
    ;

identifiers
    : Identifier (Comma Identifier)*
    ;

type
    : Int
    | Bool
    | ClassIndentifier
    | array
    | fptr
    | set
    ;

array
    : (Int | Bool | ClassIndentifier) LeftBracket expression RightBracket
    ;

fptr
    : Fptr Less (Void | types) Arrow (Void | type) Greater
    ;

set
    : Set Less Int Greater
    ;

types
    : type (Comma type)*
    ;

//Identifier (Comma Identifier)*

expression
    :
    ;



Private: 'private';
Public: 'public';
Int: 'int';
Bool: 'bool';
BoolLiteral: 'true'| 'false';
IntLiteral: [1-9] [0-9]* | [0];
Class: 'class';
Fptr: 'fptr';
Set: 'set';
Assign: '=';
Comma: ',';
Void: 'void';
LeftBracket: '[';
RightBracket: ']';
LeftParenthesis: '(';
RightParenthesis: ')';
LeftCurlyBracket: '{';
RightCurlyBracket: '}';
Arrow: '->';
NewLine: [\n\r];
Main: 'main';
Less: '<';
Greater: '>';
Semicolon: ';';
ClassIndentifier: [A-Z][a-zA-Z0-9_]*;
Identifier: [a-z_][a-zA-Z0-9_]*;
ArgumentIdentifier: [a-zA-Z0-9]*;

Comment: '#' (~[\r\n])*  -> skip;
MultilineComment: '=begin' (.)*? '=end' -> skip;
WS: [ \t] -> skip;






