// Generated from D:/CE@UT/Term 6/PLC/CA/antlr_intro/src/main/grammar\SimpleLOOP.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleLOOPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleLOOPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#simpleLOOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleLOOP(SimpleLOOPParser.SimpleLOOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#globalSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalSection(SimpleLOOPParser.GlobalSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassSection(SimpleLOOPParser.ClassSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SimpleLOOPParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(SimpleLOOPParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariable(SimpleLOOPParser.ClassVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(SimpleLOOPParser.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(SimpleLOOPParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#multiStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatements(SimpleLOOPParser.MultiStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SimpleLOOPParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimpleLOOPParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SimpleLOOPParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#iterativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeStatement(SimpleLOOPParser.IterativeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#methodArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArguments(SimpleLOOPParser.MethodArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(SimpleLOOPParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#mergeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeStatement(SimpleLOOPParser.MergeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#addStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddStatement(SimpleLOOPParser.AddStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(SimpleLOOPParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(SimpleLOOPParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#methodDeclarationArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarationArguments(SimpleLOOPParser.MethodDeclarationArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#singleMethodArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMethodArgument(SimpleLOOPParser.SingleMethodArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimpleLOOPParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers(SimpleLOOPParser.IdentifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SimpleLOOPParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SimpleLOOPParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#fptrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptrType(SimpleLOOPParser.FptrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#setType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(SimpleLOOPParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(SimpleLOOPParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLOOPParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(SimpleLOOPParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(SimpleLOOPParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(SimpleLOOPParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(SimpleLOOPParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(SimpleLOOPParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(SimpleLOOPParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(SimpleLOOPParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(SimpleLOOPParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(SimpleLOOPParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SimpleLOOPParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#accessExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessExpression(SimpleLOOPParser.AccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#defaultExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpressions(SimpleLOOPParser.DefaultExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(SimpleLOOPParser.ValuesContext ctx);
}