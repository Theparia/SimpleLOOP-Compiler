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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#classs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasss(SimpleLOOPParser.ClasssContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimpleLOOPParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SimpleLOOPParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SimpleLOOPParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#globalVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariable(SimpleLOOPParser.GlobalVariableContext ctx);
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
	 * Visit a parse tree produced by {@link SimpleLOOPParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SimpleLOOPParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#fptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptr(SimpleLOOPParser.FptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SimpleLOOPParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(SimpleLOOPParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleLOOPParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimpleLOOPParser.ExpressionContext ctx);
}