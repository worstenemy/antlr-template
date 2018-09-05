// Generated from E:/report/query/src/main/java/cn/cdxt/hbd/evaluator/antlr\QueryParser.g4 by ANTLR 4.7
package we.template.evaluator.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code richText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRichText(QueryParser.RichTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code richText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRichText(QueryParser.RichTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPlainText(QueryParser.PlainTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPlainText(QueryParser.PlainTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(QueryParser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(QueryParser.DslContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 */
	void enterIdType(QueryParser.IdTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 */
	void exitIdType(QueryParser.IdTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(QueryParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(QueryParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(QueryParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(QueryParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(QueryParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(QueryParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicAndExpression(QueryParser.LogicAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicAndExpression(QueryParser.LogicAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicOrExpression(QueryParser.LogicOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicOrExpression(QueryParser.LogicOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicBaseExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicBaseExpression(QueryParser.LogicBaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicBaseExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicBaseExpression(QueryParser.LogicBaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(QueryParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(QueryParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareBaseExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterCompareBaseExpression(QueryParser.CompareBaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareBaseExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitCompareBaseExpression(QueryParser.CompareBaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterGt(QueryParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitGt(QueryParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterLt(QueryParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitLt(QueryParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterEq(QueryParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitEq(QueryParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ge}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterGe(QueryParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitGe(QueryParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code le}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterLe(QueryParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code le}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitLe(QueryParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ne}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterNe(QueryParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitNe(QueryParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(QueryParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(QueryParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(QueryParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(QueryParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(QueryParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(QueryParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpression(QueryParser.ConcatExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpression(QueryParser.ConcatExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(QueryParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(QueryParser.FunctionExpressionContext ctx);
}