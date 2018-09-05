// Generated from E:/report/query/src/main/java/cn/cdxt/hbd/evaluator/antlr\QueryParser.g4 by ANTLR 4.7
package we.template.evaluator.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(QueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code richText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRichText(QueryParser.RichTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainText}
	 * labeled alternative in {@link QueryParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainText(QueryParser.PlainTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#dsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl(QueryParser.DslContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdType(QueryParser.IdTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcType}
	 * labeled alternative in {@link QueryParser#dslType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(QueryParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(QueryParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(QueryParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicAndExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicAndExpression(QueryParser.LogicAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicOrExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOrExpression(QueryParser.LogicOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicBaseExpression}
	 * labeled alternative in {@link QueryParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicBaseExpression(QueryParser.LogicBaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(QueryParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareBaseExpression}
	 * labeled alternative in {@link QueryParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBaseExpression(QueryParser.CompareBaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(QueryParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(QueryParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eq}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(QueryParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(QueryParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code le}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(QueryParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ne}
	 * labeled alternative in {@link QueryParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNe(QueryParser.NeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpression(QueryParser.IdExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(QueryParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(QueryParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatExpression(QueryParser.ConcatExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(QueryParser.FunctionExpressionContext ctx);
}