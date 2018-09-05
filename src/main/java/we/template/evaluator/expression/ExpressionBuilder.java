package we.template.evaluator.expression;

import we.template.evaluator.ParseHelper;
import we.template.evaluator.ParseResult;
import we.template.evaluator.antlr.QueryLexer;
import we.template.evaluator.antlr.QueryParser;
import we.template.evaluator.antlr.QueryParserBaseVisitor;
import we.template.evaluator.expression.impl.CompareExpression;
import we.template.evaluator.expression.impl.CompositeExpression;
import we.template.evaluator.expression.impl.ConcatExpression;
import we.template.evaluator.expression.impl.FunctionExpression;
import we.template.evaluator.expression.impl.IdExpression;
import we.template.evaluator.expression.impl.LogicalExpression;
import we.template.evaluator.expression.impl.NumberExpression;
import we.template.evaluator.expression.impl.PlainTextExpression;
import we.template.evaluator.expression.impl.StringExpression;

import java.util.ArrayList;
import java.util.List;

public class ExpressionBuilder extends QueryParserBaseVisitor<Expression> {
	private static final ExpressionBuilder DEFAULT = new ExpressionBuilder();

	public static CompositeExpression build(String text) {
		ParseResult result = ParseHelper.parse(
				"expression parse",
				text,
				QueryParser::new,
				QueryLexer::new,
				QueryParser::query,
				true);
		return (CompositeExpression) DEFAULT.visit(result.getTree());
	}

	@Override
	public Expression visitQuery(QueryParser.QueryContext ctx) {
		List<QueryParser.StatementContext> statementContexts = ctx.statement();
		CompositeExpression expression = new CompositeExpression();
		for (QueryParser.StatementContext context : statementContexts) {
			expression.addExpression(visit(context));
		}
		return expression;
	}

	@Override
	public Expression visitRichText(QueryParser.RichTextContext ctx) {
		return visitDsl(ctx.dsl());
	}

	@Override
	public Expression visitPlainText(QueryParser.PlainTextContext ctx) {
		return new PlainTextExpression(ctx.getText());
	}

	@Override
	public Expression visitDsl(QueryParser.DslContext ctx) {
		return visit(ctx.dslType());
	}

	@Override
	public Expression visitIdType(QueryParser.IdTypeContext ctx) {
		return new IdExpression(ctx.getText());
	}

	@Override
	public Expression visitFuncType(QueryParser.FuncTypeContext ctx) {
		return visitFunction(ctx.function());
	}

	@Override
	public Expression visitFunction(QueryParser.FunctionContext ctx) {
		String name = ctx.name.getText();
		List<QueryParser.LogicExpressionContext> parametersContext = ctx.params.logicExpression();
		List<Expression> parameters = new ArrayList<>(parametersContext.size());
		for (QueryParser.LogicExpressionContext context : parametersContext) {
			parameters.add(visit(context));
		}
		return new FunctionExpression(name, parameters);
	}

	@Override
	public Expression visitLogicAndExpression(QueryParser.LogicAndExpressionContext ctx) {
		Expression leftExpression = visit(ctx.left);
		Expression rightExpression = visit(ctx.right);
		return new LogicalExpression(leftExpression, rightExpression, LogicalExpression.LogicOperator.and);
	}

	@Override
	public Expression visitLogicOrExpression(QueryParser.LogicOrExpressionContext ctx) {
		Expression leftExpression = visit(ctx.left);
		Expression rightExpression = visit(ctx.right);
		return new LogicalExpression(leftExpression, rightExpression, LogicalExpression.LogicOperator.or);
	}

	@Override
	public Expression visitLogicBaseExpression(QueryParser.LogicBaseExpressionContext ctx) {
		return visit(ctx.boolExpression());
	}

	@Override
	public Expression visitCompareExpression(QueryParser.CompareExpressionContext ctx) {
		Expression leftExpression = visit(ctx.left);
		Expression rightExpression = visit(ctx.right);
		return new CompareExpression(leftExpression, rightExpression, ctx.comp.getText());
	}

	@Override
	public Expression visitCompareBaseExpression(QueryParser.CompareBaseExpressionContext ctx) {
		return visit(ctx.expression());
	}

	@Override
	public Expression visitIdExpression(QueryParser.IdExpressionContext ctx) {
		return new IdExpression(ctx.Identifier().getText());
	}

	@Override
	public Expression visitStringExpression(QueryParser.StringExpressionContext ctx) {
		return new StringExpression(ctx.getText());
	}

	@Override
	public Expression visitNumberExpression(QueryParser.NumberExpressionContext ctx) {
		return new NumberExpression(ctx.getText());
	}

	@Override
	public Expression visitConcatExpression(QueryParser.ConcatExpressionContext ctx) {
		Expression leftExpression = visit(ctx.left);
		Expression rightExpression = visit(ctx.right);
		return new ConcatExpression(leftExpression, rightExpression);
	}

	@Override
	public Expression visitFunctionExpression(QueryParser.FunctionExpressionContext ctx) {
		return visitFunction(ctx.function());
	}
}