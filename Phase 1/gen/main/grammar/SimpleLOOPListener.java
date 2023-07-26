// Generated from D:/CE@UT/Term 6/PLC/CA/antlr_intro/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLOOPParser}.
 */
public interface SimpleLOOPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 */
	void enterSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 */
	void exitSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#globalSection}.
	 * @param ctx the parse tree
	 */
	void enterGlobalSection(SimpleLOOPParser.GlobalSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#globalSection}.
	 * @param ctx the parse tree
	 */
	void exitGlobalSection(SimpleLOOPParser.GlobalSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 */
	void enterClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 */
	void exitClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SimpleLOOPParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SimpleLOOPParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SimpleLOOPParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SimpleLOOPParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classVariable}.
	 * @param ctx the parse tree
	 */
	void enterClassVariable(SimpleLOOPParser.ClassVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classVariable}.
	 * @param ctx the parse tree
	 */
	void exitClassVariable(SimpleLOOPParser.ClassVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(SimpleLOOPParser.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(SimpleLOOPParser.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#multiStatements}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatements(SimpleLOOPParser.MultiStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#multiStatements}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatements(SimpleLOOPParser.MultiStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SimpleLOOPParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SimpleLOOPParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#iterativeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterativeStatement(SimpleLOOPParser.IterativeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#iterativeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterativeStatement(SimpleLOOPParser.IterativeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodArguments(SimpleLOOPParser.MethodArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#methodArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodArguments(SimpleLOOPParser.MethodArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStatement(SimpleLOOPParser.MethodCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#methodCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStatement(SimpleLOOPParser.MethodCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void enterMergeStatement(SimpleLOOPParser.MergeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#mergeStatement}.
	 * @param ctx the parse tree
	 */
	void exitMergeStatement(SimpleLOOPParser.MergeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#addStatement}.
	 * @param ctx the parse tree
	 */
	void enterAddStatement(SimpleLOOPParser.AddStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#addStatement}.
	 * @param ctx the parse tree
	 */
	void exitAddStatement(SimpleLOOPParser.AddStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(SimpleLOOPParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(SimpleLOOPParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#methodDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarationArguments(SimpleLOOPParser.MethodDeclarationArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#methodDeclarationArguments}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarationArguments(SimpleLOOPParser.MethodDeclarationArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#singleMethodArgument}.
	 * @param ctx the parse tree
	 */
	void enterSingleMethodArgument(SimpleLOOPParser.SingleMethodArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#singleMethodArgument}.
	 * @param ctx the parse tree
	 */
	void exitSingleMethodArgument(SimpleLOOPParser.SingleMethodArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimpleLOOPParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimpleLOOPParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(SimpleLOOPParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(SimpleLOOPParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SimpleLOOPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SimpleLOOPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SimpleLOOPParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SimpleLOOPParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void enterFptrType(SimpleLOOPParser.FptrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void exitFptrType(SimpleLOOPParser.FptrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(SimpleLOOPParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(SimpleLOOPParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(SimpleLOOPParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(SimpleLOOPParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimpleLOOPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimpleLOOPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(SimpleLOOPParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(SimpleLOOPParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(SimpleLOOPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(SimpleLOOPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SimpleLOOPParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SimpleLOOPParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpression(SimpleLOOPParser.AccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#accessExpression}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpression(SimpleLOOPParser.AccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#defaultExpressions}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpressions(SimpleLOOPParser.DefaultExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#defaultExpressions}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpressions(SimpleLOOPParser.DefaultExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(SimpleLOOPParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(SimpleLOOPParser.ValuesContext ctx);
}