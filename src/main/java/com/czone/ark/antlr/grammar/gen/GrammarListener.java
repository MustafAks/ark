// Generated from C:/Users/musta/IdeaProjects/ark/ark/src/main/java/com/czone/ark/antlr/grammar\Grammar.g4 by ANTLR 4.9.1
package com.czone.ark.antlr.grammar.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(GrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(GrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(GrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(GrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(GrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(GrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(GrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(GrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(GrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(GrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(GrammarParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(GrammarParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(GrammarParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(GrammarParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(GrammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(GrammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(GrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(GrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(GrammarParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(GrammarParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(GrammarParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(GrammarParser.ReadExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(GrammarParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(GrammarParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(GrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(GrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(GrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(GrammarParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(GrammarParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(GrammarParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(GrammarParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(GrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(GrammarParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(GrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(GrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(GrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(GrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(GrammarParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(GrammarParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(GrammarParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(GrammarParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(GrammarParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(GrammarParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(GrammarParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(GrammarParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(GrammarParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(GrammarParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(GrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(GrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(GrammarParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(GrammarParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(GrammarParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(GrammarParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(GrammarParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(GrammarParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(GrammarParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(GrammarParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(GrammarParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(GrammarParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(GrammarParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(GrammarParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link GrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(GrammarParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(GrammarParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(GrammarParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(GrammarParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(GrammarParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(GrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(GrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(GrammarParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(GrammarParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return_value}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value(GrammarParser.Return_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return_value}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value(GrammarParser.Return_valueContext ctx);
}