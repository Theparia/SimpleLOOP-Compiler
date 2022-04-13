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
	 * Enter a parse tree produced by {@link SimpleLOOPParser#classs}.
	 * @param ctx the parse tree
	 */
	void enterClasss(SimpleLOOPParser.ClasssContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#classs}.
	 * @param ctx the parse tree
	 */
	void exitClasss(SimpleLOOPParser.ClasssContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleLOOPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SimpleLOOPParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SimpleLOOPParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SimpleLOOPParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SimpleLOOPParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariable(SimpleLOOPParser.GlobalVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#globalVariable}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariable(SimpleLOOPParser.GlobalVariableContext ctx);
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
	 * Enter a parse tree produced by {@link SimpleLOOPParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SimpleLOOPParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SimpleLOOPParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#fptr}.
	 * @param ctx the parse tree
	 */
	void enterFptr(SimpleLOOPParser.FptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#fptr}.
	 * @param ctx the parse tree
	 */
	void exitFptr(SimpleLOOPParser.FptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SimpleLOOPParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SimpleLOOPParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(SimpleLOOPParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLOOPParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(SimpleLOOPParser.TypesContext ctx);
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
}