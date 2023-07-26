grammar SimpleLOOP;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.classDec.*;
     import main.ast.nodes.declaration.classDec.classMembersDec.*;
     import main.ast.nodes.declaration.variableDec.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.nodes.statement.set.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import main.ast.types.set.*;
     import main.ast.types.functionPointer.*;
     import main.ast.types.array.*;
     import java.util.*;
 }

simpleLOOP returns [Program simpleLOOPProgram]:
    NEWLINE* p = program {$simpleLOOPProgram = $p.programRet;} NEWLINE* EOF;

program returns [Program programRet]:
    {
        $programRet = new Program();
        int line = 1;
        $programRet.setLine(line);
    }
    (v = varDecStatement NEWLINE+
    {
        for (VariableDeclaration varDec: $v.varDecStmtRet)
            $programRet.addGlobalVariable(varDec);
    })*
    (c = classDeclaration NEWLINE+ {$programRet.addClass($c.classDeclarationRet);})*;

//todo done
constructor returns [ConstructorDeclaration constructorDecRet]
    :
    PUBLIC init = INITIALIZE
    {
        $constructorDecRet = new ConstructorDeclaration();
        $constructorDecRet.setLine($init.getLine());
    }
    methodArgsDec NEWLINE* methodBody
    {
        $constructorDecRet.setArgs($methodArgsDec.methodArgsDecRet);
        $constructorDecRet.setBody($methodBody.statements);
        $constructorDecRet.setLocalVars($methodBody.localVars);
    };
      
//todo done??
classDeclaration returns [ClassDeclaration classDeclarationRet]
    : CLASS className = class_identifier
    {
        $classDeclarationRet = new ClassDeclaration($className.classIdRet);
        $classDeclarationRet.setLine($CLASS.getLine());
    }
    (LESS_THAN parent = class_identifier { $classDeclarationRet.setParentClassName($parent.classIdRet); })?
    NEWLINE* ((LBRACE NEWLINE+ (decs1 = field_decleration
    {
        for (Declaration dec: $decs1.declarationsRet)
        {
            if(dec instanceof FieldDeclaration)
                $classDeclarationRet.addField((FieldDeclaration)dec);
            else if(dec instanceof ConstructorDeclaration)
                $classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
            else if(dec instanceof MethodDeclaration)
                $classDeclarationRet.addMethod((MethodDeclaration)dec);
        }
    }
    NEWLINE+)+ RBRACE)
    | (decs2 = field_decleration
    {
        for (Declaration dec: $decs2.declarationsRet)
            {
                if(dec instanceof FieldDeclaration)
                    $classDeclarationRet.addField((FieldDeclaration)dec);
                else if(dec instanceof ConstructorDeclaration)
                    $classDeclarationRet.setConstructor((ConstructorDeclaration)dec);
                else if(dec instanceof MethodDeclaration)
                    $classDeclarationRet.addMethod((MethodDeclaration)dec);
            }
    }));

//todo done
field_decleration returns [ArrayList <Declaration> declarationsRet] locals [boolean isPrivate]
    : { $declarationsRet = new ArrayList<Declaration>(); }
    ((( (PUBLIC { $isPrivate = false; } | PRIVATE { $isPrivate = true; })
    (v = varDecStatement
    {
        for (VariableDeclaration varDec: $v.varDecStmtRet)
        {
            FieldDeclaration fieldDec = new FieldDeclaration(varDec, $isPrivate);
            fieldDec.setLine(varDec.getLine());
            $declarationsRet.add(fieldDec);
        }
    }
    | m = method
    {
        var methodDec = $m.methodDecRet;
        methodDec.setPrivate($isPrivate);
        $declarationsRet.add(methodDec);
    } ))
    | c = constructor { $declarationsRet.add($c.constructorDecRet); } ))
    ;

//todo done
method returns [MethodDeclaration methodDecRet]
    : { $methodDecRet = new MethodDeclaration(); }
    (t = type
    {
        $methodDecRet.setReturnType($t.typeRet);
        $methodDecRet.setDoesReturn(true);
    }
    | VOID { $methodDecRet.setReturnType(new VoidType()); })
    id = identifier
    {
        $methodDecRet.setMethodName($id.idRet);
        $methodDecRet.setLine($id.idRet.getLine());
    }
    args = methodArgsDec { $methodDecRet.setArgs($args.methodArgsDecRet); }
    NEWLINE* b = methodBody
    {
        $methodDecRet.setBody($b.statements);
        $methodDecRet.setLocalVars($b.localVars);
    }
    ;

//todo done
methodBody returns [ArrayList<Statement> statements, ArrayList<VariableDeclaration> localVars]
    :
    {
        $statements = new ArrayList<Statement>();
        $localVars = new ArrayList<VariableDeclaration>();
    }
    LBRACE NEWLINE+ (v1 = varDecStatement{ $localVars.addAll($v1.varDecStmtRet); } NEWLINE+)*
    (s1 = singleStatement { $statements.add($s1.stmtRet); } NEWLINE+)* RBRACE
    |
    {
        $statements = new ArrayList<Statement>();
        $localVars = new ArrayList<VariableDeclaration>();
    }
    ((v2 = varDecStatement { $localVars.addAll($v2.varDecStmtRet); })
    | (s2 = singleStatement { $statements.add($s2.stmtRet); } ));

//todo  ASSIGN chi mishe ????????????????????????????????????????????????????
methodArgsDec returns [ArrayList<VariableDeclaration> methodArgsDecRet]
    : { $methodArgsDecRet = new ArrayList<VariableDeclaration>(); }
    LPAR (arg1 = argDec { $methodArgsDecRet.add($arg1.varDecRet); } ((ASSIGN orExpression)
    | (COMMA arg2 = argDec { $methodArgsDecRet.add($arg2.varDecRet); } )*)
    (COMMA arg3 = argDec { $methodArgsDecRet.add($arg3.varDecRet); } ASSIGN orExpression)*)? RPAR
    ;

//todo done
argDec returns [VariableDeclaration varDecRet]
    : t = type id = identifier
    {
        $varDecRet = new VariableDeclaration($id.idRet, $t.typeRet);
        $varDecRet.setLine($id.idRet.getLine());
    }
    ;

//todo done
methodArgs returns [ArrayList<Expression> methodArgsRet]
    : { $methodArgsRet = new ArrayList<Expression>(); }
    (e1 = expression {$methodArgsRet.add($e1.exprRet);}
    (COMMA e2 = expression {$methodArgsRet.add($e2.exprRet);} )*)?
    ;

//todo done
body returns [Statement stmtRet]
    :
     (blockStatement { $stmtRet = $blockStatement.blockStmtRet; }
     | (NEWLINE+ singleStatement { $stmtRet = $singleStatement.stmtRet; }
     ))
     ;

//todo done
blockStatement returns [BlockStmt blockStmtRet]
    :
    LBRACE
    {
        $blockStmtRet = new BlockStmt();
        $blockStmtRet.setLine($LBRACE.getLine());
    }
    NEWLINE+ (s = singleStatement { $blockStmtRet.addStatement($s.stmtRet); } NEWLINE+)* RBRACE
    ;

//todo done
singleStatement returns [Statement stmtRet]
    :
    ifStatement { $stmtRet = $ifStatement.conditionalStmtRet; }
    | printStatement { $stmtRet = $printStatement.printStmtRet; }
    | methodCallStmt { $stmtRet = $methodCallStmt.methodCallStmtRet; }
    | returnStatement { $stmtRet = $returnStatement.returnStmtRet; }
    | assignmentStatement { $stmtRet = $assignmentStatement.assignmentStmtRet; }
    | loopStatement { $stmtRet = $loopStatement.eachStmtRet; }
    | addStatement { $stmtRet = $addStatement.setAddRet; }
    | mergeStatement { $stmtRet = $mergeStatement.setMergeRet; }
    | deleteStatement { $stmtRet = $deleteStatement.setDeleteRet; }
    ;

//todo done
addStatement returns [SetAdd setAddRet]
    :
    expr = expression DOT ADD LPAR orExpr = orExpression RPAR
    {
        $setAddRet = new SetAdd($expr.exprRet, $orExpr.orExprRet);
        $setAddRet.setLine($ADD.getLine());
    };

//todo done
mergeStatement returns [SetMerge setMergeRet] locals[Expression setArg, ArrayList<Expression> elementArgs]
    : { $elementArgs = new ArrayList<Expression>(); }
    expr = expression { $setArg = $expr.exprRet; }
    DOT MERGE LPAR orExpr1 = orExpression { $elementArgs.add($orExpr1.orExprRet); }
    (COMMA orExpr2 = orExpression { $elementArgs.add($orExpr2.orExprRet); })* RPAR
    {
        $setMergeRet = new SetMerge($setArg, $elementArgs);
        $setMergeRet.setLine($MERGE.getLine());
    };

//todo done
deleteStatement returns [SetDelete setDeleteRet]
    :
    expr = expression DOT DELETE LPAR orExpr = orExpression RPAR
    {
        $setDeleteRet = new SetDelete($expr.exprRet, $orExpr.orExprRet);
        $setDeleteRet.setLine($DELETE.getLine());
    };

//todo done
varDecStatement returns [ArrayList<VariableDeclaration> varDecStmtRet]
    :
    { $varDecStmtRet = new ArrayList<VariableDeclaration>(); }
    t = type id1 = identifier
    {
        VariableDeclaration varDec1 = new VariableDeclaration($id1.idRet, $t.typeRet);
        varDec1.setLine($id1.idRet.getLine());
        $varDecStmtRet.add(varDec1);
    }
    (COMMA id2 = identifier
    {
        VariableDeclaration varDec2 = new VariableDeclaration($id2.idRet, $t.typeRet);
        varDec2.setLine($id2.idRet.getLine());
        $varDecStmtRet.add(varDec2);
    })*;


//todo done
ifStatement returns [ConditionalStmt conditionalStmtRet]
    :
    IF condition body
    {
        $conditionalStmtRet = new ConditionalStmt($condition.condExpr, $body.stmtRet);
        $conditionalStmtRet.setLine($IF.getLine());
    }
    (elsifStatement { $conditionalStmtRet.addElsif($elsifStatement.elsifRet); } )*
    (elseStatement { $conditionalStmtRet.setElseBody($elseStatement.elseRet); } )?;

//todo done
elsifStatement returns [ElsifStmt elsifRet]
    :
     NEWLINE* ELSIF condition body { $elsifRet = new ElsifStmt($condition.condExpr, $body.stmtRet); }
     ;

//todo done
condition returns [Expression condExpr]
    :
    (LPAR expr1 = expression { $condExpr = $expr1.exprRet; } RPAR)
    | (expr2 = expression { $condExpr = $expr2.exprRet; });

//todo done
elseStatement returns [Statement elseRet]
    :
    NEWLINE* ELSE body { $elseRet = $body.stmtRet; }
    ;

//todo done
printStatement returns [PrintStmt printStmtRet]
    :
    PRINT LPAR expr = expression RPAR
    {
        $printStmtRet = new PrintStmt($expr.exprRet);
        $printStmtRet.setLine($PRINT.getLine());
    };

//todo done ????????????????????????????????????????????????????????????????????????
methodCallStmt returns [MethodCallStmt methodCallStmtRet] locals[Expression instance]
    :
    accessExpression { $instance = $accessExpression.accessExprRet; }
    (DOT (init = INITIALIZE
    {
        Identifier id1 = new Identifier($init.text);
        id1.setLine($init.getLine());
        $instance = new ObjectMemberAccess($instance, id1);
        $instance.setLine(id1.getLine());
    }
    | id2 = identifier
    {
        $instance = new ObjectMemberAccess($instance, $id2.idRet);
        $instance.setLine($id2.idRet.getLine());
    }))*
    ((LPAR methodArgs RPAR))
    {
        MethodCall methodCall = new MethodCall($instance, $methodArgs.methodArgsRet);
        methodCall.setLine($LPAR.getLine());
        $methodCallStmtRet = new MethodCallStmt(methodCall);
        $methodCallStmtRet.setLine($LPAR.getLine());
    }
    ;

//todo done
returnStatement returns [ReturnStmt returnStmtRet]
    :
    RETURN
    {
        $returnStmtRet = new ReturnStmt();
        $returnStmtRet.setLine($RETURN.getLine());
    }
    (expr = expression
    {
        $returnStmtRet.setReturnedExpr($expr.exprRet);
    })?;

//todo done
assignmentStatement returns [AssignmentStmt assignmentStmtRet]
    :
    lval = orExpression ASSIGN rval = expression
    {
        $assignmentStmtRet = new AssignmentStmt($lval.orExprRet, $rval.exprRet);
        $assignmentStmtRet.setLine($ASSIGN.getLine());
    };

//todo done
loopStatement returns [EachStmt eachStmtRet] locals[Expression list]
    :
    ((accessExpression { $list = $accessExpression.accessExprRet; })
    | (LPAR leftExpr = expression DOT DOT rightExpr = expression RPAR
    {
        RangeExpression rangeExpr = new RangeExpression($leftExpr.exprRet, $rightExpr.exprRet);
        rangeExpr.setLine($LPAR.getLine());
        $list = rangeExpr;
    }))
    DOT EACH DO BAR id = identifier BAR b = body
    {
        $eachStmtRet = new EachStmt($id.idRet, $list);
        $eachStmtRet.setLine($EACH.getLine());
        $eachStmtRet.setBody($b.stmtRet);
    }
    ;

//todo done
expression returns [Expression exprRet]
    :
    ternaryExpr = ternaryExpression { $exprRet = $ternaryExpr.ternaryExprRet; }
    (ASSIGN expr = expression
    {
        BinaryOperator op = BinaryOperator.assign;
        $exprRet = new BinaryExpression($exprRet, $expr.exprRet, op);
        $exprRet.setLine($ASSIGN.getLine());
    }
    )?
    (DOT INCLUDE LPAR orExpr=orExpression RPAR
    {
        $exprRet = new SetInclude($exprRet, $orExpr.orExprRet);
        $exprRet.setLine($INCLUDE.getLine());
    })?;

//todo done /* Ternary Operator ?? */
ternaryExpression returns [Expression ternaryExprRet]
    :
    orExpr = orExpression { $ternaryExprRet = $orExpr.orExprRet; }
    (TIF trueExpr = ternaryExpression TELSE falseExpr = ternaryExpression
    {
        $ternaryExprRet = new TernaryExpression($ternaryExprRet, $trueExpr.ternaryExprRet, $falseExpr.ternaryExprRet);
        $ternaryExprRet.setLine($TIF.getLine());
    })?;

//todo done
orExpression returns [Expression orExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = andExpression { $orExprRet = $operand1.andExprRet; }
    (OR
    {
        $op = BinaryOperator.or;
        $line = $OR.getLine();
    }
    operand2 = andExpression
    {
        $orExprRet = new BinaryExpression($orExprRet, $operand2.andExprRet, $op);
        $orExprRet.setLine($line);
    })*
    ;

//todo done
andExpression returns [Expression andExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = equalityExpression { $andExprRet = $operand1.eqExprRet; }
    (AND
    {
        $op = BinaryOperator.and;
        $line = $AND.getLine();
    }
    operand2 = equalityExpression
    {
        $andExprRet = new BinaryExpression($andExprRet, $operand2.eqExprRet, $op);
        $andExprRet.setLine($line);
    })*;

//todo done
equalityExpression returns [Expression eqExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = relationalExpression { $eqExprRet = $operand1.relExprRet; }
    (EQUAL
    {
        $op = BinaryOperator.eq;
        $line = $EQUAL.getLine();
    }
    operand2 = relationalExpression
    {
        $eqExprRet = new BinaryExpression($eqExprRet, $operand2.relExprRet, $op);
        $eqExprRet.setLine($line);
    })*;

//todo done
relationalExpression returns [Expression relExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = additiveExpression { $relExprRet = $operand1.addExprRet; }
    ((GREATER_THAN
    {
        $op = BinaryOperator.gt;
        $line = $GREATER_THAN.getLine();
    }
    | LESS_THAN
    {
        $op = BinaryOperator.lt;
        $line = $LESS_THAN.getLine();
    }
    )
    operand2 = additiveExpression
    {
        $relExprRet = new BinaryExpression($relExprRet, $operand2.addExprRet, $op);
        $relExprRet.setLine($line);
    })*;

//todo done
additiveExpression returns [Expression addExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = multiplicativeExpression { $addExprRet = $operand1.multExprRet; }
    ((PLUS
    {
        $op = BinaryOperator.add;
        $line = $PLUS.getLine();
    }
    | MINUS
    {
        $op = BinaryOperator.sub;
        $line = $MINUS.getLine();
    }
    )
    operand2 = multiplicativeExpression
    {
        $addExprRet = new BinaryExpression($addExprRet, $operand2.multExprRet, $op);
        $addExprRet.setLine($line);
    })*;

//todo done
multiplicativeExpression returns [Expression multExprRet] locals[BinaryOperator op, int line]
    :
    operand1 = preUnaryExpression { $multExprRet = $operand1.preUnaryExprRet; }
    ((MULT
    {
        $op = BinaryOperator.mult;
        $line = $MULT.getLine();
    }
    | DIVIDE
    {
        $op = BinaryOperator.div;
        $line = $DIVIDE.getLine();
    }
    )
    operand2 = preUnaryExpression
    {
        $multExprRet = new BinaryExpression($multExprRet, $operand2.preUnaryExprRet, $op);
        $multExprRet.setLine($line);
    })*;

//todo done
preUnaryExpression returns [Expression preUnaryExprRet] locals[UnaryOperator op, int line]
    :
    ((NOT
    {
        $op = UnaryOperator.not;
        $line = $NOT.getLine();
    }
    | MINUS
    {
        $op = UnaryOperator.minus;
        $line = $MINUS.getLine();
    })
    pre = preUnaryExpression
    {
        $preUnaryExprRet = new UnaryExpression($pre.preUnaryExprRet, $op);
        $preUnaryExprRet.setLine($line);
    })
    | post = postUnaryExpression
    {
        $preUnaryExprRet = $post.postUnaryExprRet;
    }
    ;

//todo done
postUnaryExpression returns [Expression postUnaryExprRet]
    :
    ae = accessExpression { $postUnaryExprRet = $ae.accessExprRet; }
    ((INC
    { UnaryOperator op = UnaryOperator.postinc;
      $postUnaryExprRet = new UnaryExpression($postUnaryExprRet, op);
      $postUnaryExprRet.setLine($INC.getLine());
    }
    | DEC
    { UnaryOperator op = UnaryOperator.postdec;
      $postUnaryExprRet = new UnaryExpression($postUnaryExprRet, op);
      $postUnaryExprRet.setLine($DEC.getLine());
    }
    ))?;

//todo done INITIALIZE ??????????????????????????????????
accessExpression returns [Expression accessExprRet]
    :
    oe = otherExpression { $accessExprRet = $oe.otherExprRet; }
    ((LPAR args = methodArgs
    {
        if($accessExprRet instanceof NewClassInstance)
        {
            ((NewClassInstance) $accessExprRet).setArgs($methodArgs.methodArgsRet);
        }
        else{
            $accessExprRet = new MethodCall($accessExprRet, $args.methodArgsRet);
            $accessExprRet.setLine($LPAR.line);
        }
    }
    RPAR)
    |(DOT (id1 = identifier
    {
        $accessExprRet = new ObjectMemberAccess($accessExprRet, $id1.idRet);
        $accessExprRet.setLine($id1.idRet.getLine());
    }
    | NEW
    {
        ClassType c = new ClassType((Identifier)$accessExprRet);
        $accessExprRet = new NewClassInstance(c);
        $accessExprRet.setLine($NEW.getLine());
    }
    | init = INITIALIZE
    {
        Identifier id2 = new Identifier($init.text);
        id2.setLine($init.getLine());
        $accessExprRet = new ObjectMemberAccess($accessExprRet, id2);
        $accessExprRet.setLine(id2.getLine());
    }
    )))*
    ((DOT (id2 = identifier
    {
        $accessExprRet = new ObjectMemberAccess($accessExprRet, $id2.idRet);
        $accessExprRet.setLine($id2.idRet.getLine());
    }
    ))
    | (LBRACK expr = expression
    {
        $accessExprRet = new ArrayAccessByIndex($accessExprRet, $expr.exprRet);
        $accessExprRet.setLine($LBRACK.line);
    }
    RBRACK))*;


//todo done
otherExpression returns [Expression otherExprRet]
    :
    SELF
    {
        $otherExprRet = new SelfClass();
        $otherExprRet.setLine($SELF.getLine());
    }
    | c = class_identifier {$otherExprRet = $c.classIdRet; }
    | v = value {$otherExprRet = $v.valueRet; }
    | i = identifier {$otherExprRet = $i.idRet; }
    | s = setNew {$otherExprRet = $s.setNewRet; }
    | LPAR e = expression RPAR {$otherExprRet = $e.exprRet; }
    ;

//todo done
setNew returns [SetNew setNewRet] locals[ArrayList<Expression> args]
    : { $args = new ArrayList<Expression>(); }
    SET DOT NEW LPAR (LPAR orExpr1 = orExpression { $args.add($orExpr1.orExprRet); }
    (COMMA orExpr2 = orExpression { $args.add($orExpr2.orExprRet); } )* RPAR)?  RPAR
    {
        $setNewRet = new SetNew($args);
        $setNewRet.setLine($NEW.getLine());
    }
    ;

//todo done
value returns [Value valueRet]
    :
    boolValue { $valueRet = $boolValue.boolValueRet; }
    | INT_VALUE
    {
        $valueRet = new IntValue($INT_VALUE.int);
        $valueRet.setLine($INT_VALUE.getLine());
    }
    ;

//todo done
boolValue returns [BoolValue boolValueRet]
    :
    TRUE
    {
        $boolValueRet = new BoolValue(true);
        $boolValueRet.setLine($TRUE.getLine());
    }
    | FALSE
    {
        $boolValueRet = new BoolValue(false);
        $boolValueRet.setLine($FALSE.getLine());
    }
    ;

//todo done
class_identifier returns [Identifier classIdRet]
    :
    cid = CLASS_IDENTIFIER
    {
        $classIdRet = new Identifier($cid.text);
        $classIdRet.setLine($cid.getLine());
    }
    ;

//todo done
identifier returns [Identifier idRet]
    :
    id = IDENTIFIER
    {
        $idRet = new Identifier($id.text);
        $idRet.setLine($id.getLine());
    }
    ;

//todo done
type returns [Type typeRet]
    :
    INT { $typeRet =  new IntType(); }
    | BOOL { $typeRet =  new BoolType(); }
    | a = array_type { $typeRet =  $a.arrayTypeRet; }
    | f = fptr_type { $typeRet =  $f.fptrTypeRet; }
    | s = set_type { $typeRet =  $s.setTypeRet; }
    | c = class_identifier { $typeRet = new ClassType($c.classIdRet); }
    ;

//todo done
array_type returns [ArrayType arrayTypeRet] locals[Type t, ArrayList<Expression> dims]
    : { $dims = new ArrayList<Expression>(); }
    (INT { $t = new IntType(); }
    | BOOL { $t =  new BoolType(); }
    | class_identifier { $t = new ClassType($class_identifier.classIdRet); })
    (LBRACK expression RBRACK { $dims.add($expression.exprRet); })+
    { $arrayTypeRet = new ArrayType($t, $dims); }
    ;

//todo done
fptr_type returns [FptrType fptrTypeRet] locals[ArrayList<Type> argsTypes, Type returnType]
    : { $argsTypes = new ArrayList<Type>(); }
    FPTR LESS_THAN (VOID | (t1 = type {$argsTypes.add($t1.typeRet); } (COMMA t2 = type {$argsTypes.add($t2.typeRet); })* ))
    ARROW (t3 = type { $returnType= $t3.typeRet; } | VOID { $returnType= new VoidType(); }) GREATER_THAN
    { $fptrTypeRet = new FptrType($argsTypes, $returnType); }
    ;

//todo done
set_type returns [SetType setTypeRet]
    :
    SET LESS_THAN (INT) GREATER_THAN {$setTypeRet = new SetType(); };


LINE_BREAK: ('//\n') -> skip;

CLASS: 'class';
PUBLIC: 'public';
PRIVATE: 'private';
INITIALIZE: 'initialize';
NEW: 'new';
SELF: 'self';


RETURN: 'return';
VOID: 'void';


DELETE: 'delete';
INCLUDE: 'include';
ADD: 'add';
MERGE: 'merge';
PRINT: 'print';


IF: 'if';
ELSE: 'else';
ELSIF: 'elsif';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
INC: '++';
DEC: '--';

EQUAL: '==';
GREATER_THAN: '>';
LESS_THAN: '<';

ARROW: '->';
BAR: '|';

AND: '&&';
OR: '||';
NOT: '!';

TIF: '?';
TELSE: ':';

TRUE: 'true';
FALSE: 'false';
NULL: 'null';

BEGIN: '=begin';
END: '=end';

INT: 'int';
BOOL: 'bool';
FPTR: 'fptr';
SET: 'Set';
EACH: 'each';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
SEMICOLON: ';' -> skip;
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-z_][A-Za-z0-9_]*;
CLASS_IDENTIFIER: [A-Z][A-Za-z0-9_]*;

COMMENT: '#' .*? '\n' -> skip;
MLCOMMENT: ('=begin' .*? '=end') -> skip;
WS: ([ \t\r]) -> skip;
