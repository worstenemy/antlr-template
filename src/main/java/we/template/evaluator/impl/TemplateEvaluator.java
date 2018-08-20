package we.template.evaluator.impl;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import we.template.Pair;
import we.template.ParseHelper;
import we.template.antlr.TemplateBaseVisitor;
import we.template.antlr.TemplateLexer;
import we.template.antlr.TemplateParser;
import we.template.context.EvaluationContext;
import we.template.evaluator.Evaluator;
import we.template.function.Function;
import we.template.reflection.ReflectionHelper;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class TemplateEvaluator extends TemplateBaseVisitor<Object> implements Evaluator {
	private EvaluationContext context;

	private TokenStreamRewriter rewriter;

	private TokenStream stream;

	private TemplateEvaluator() {

	}

	public static TemplateEvaluator create() {
		return new TemplateEvaluator();
	}

	@Override
	public String evaluate(String template, EvaluationContext context) {
		this.context = Objects.requireNonNull(context, "context is null");
		Objects.requireNonNull(template, "template is null");
		Pair<ParseTree, TokenStream> pair =
				ParseHelper.invoke("template evaluation",
						template,
						TemplateParser::new,
						TemplateLexer::new,
						TemplateParser::template);
		this.rewriter = new TokenStreamRewriter(pair.getSecond());
		this.stream = pair.getSecond();
		visit(pair.getFirst());
		return this.rewriter.getText();
	}

	private void replace(ParserRuleContext ctx, Object arg) {
		Token start = ctx.getStart();
		Token stop = ctx.getStop();
		this.rewriter.replace(start, stop, arg);
	}

	@Override
	public Object visitDsl_arg(TemplateParser.Dsl_argContext ctx) {
		String reference = ctx.dsl_param().getText();
		Optional<Object> result = this.context.getParameter(reference);
		result.ifPresent(arg -> replace(ctx, arg));
		return result.orElseThrow(() -> new IllegalArgumentException("can't resolve argument: " + reference));
	}

	@Override
	public Object visitDsl_call(TemplateParser.Dsl_callContext ctx) {
		Object result = visitDsl_methodInvoke(ctx.dsl_methodInvoke());
		replace(ctx, result);
		return result;
	}

	@Override
	public Object visitDsl_access(TemplateParser.Dsl_accessContext ctx) {
		Object result = visit(ctx.dsl_objectAccess());
		replace(ctx, result);
		return result;
	}

	@Override
	public Object visitDsl_notation(TemplateParser.Dsl_notationContext ctx) {
		Object result = visit(ctx.dsl_literal());
		replace(ctx, result);
		return result;
	}

	@Override
	public Object visitDsl_methodInvoke(TemplateParser.Dsl_methodInvokeContext ctx) {
		String methodName = ctx.dsl_methodName().getText();
		if (null == ctx.dsl_expressions()) {
			Optional<Function> function = this.context.getFunction(methodName);
			return function.map(call -> call.call()).orElseThrow(() -> new IllegalArgumentException("can't resolve function: " + methodName));
		} else {
			List<TemplateParser.Dsl_expressionContext> expressions = ctx.dsl_expressions().dsl_expression();
			Object[] arguments = new Object[expressions.size()];
			for (int i = 0; i < expressions.size(); ++i) {
				arguments[i] = visit(expressions.get(i));
			}
			Optional<Function> function = this.context.getFunction(methodName, arguments);
			return function.map(call -> call.call(arguments)).orElseThrow(() -> new IllegalArgumentException("can't resolve function: " + methodName));
		}
	}

	@Override
	public Object visitDsl_accessMethod(TemplateParser.Dsl_accessMethodContext ctx) {
		return this.visitDsl_methodInvoke(ctx.dsl_methodInvoke());
	}

	@Override
	public Object visitDsl_accessParam(TemplateParser.Dsl_accessParamContext ctx) {
		String reference = ctx.dsl_param().getText();
		Optional<Object> result = this.context.getParameter(reference);
		return result.orElseThrow(() -> new IllegalArgumentException("can't resolve argument: " + reference));
	}

	@Override
	public Object visitDsl_accessObjectMethod(TemplateParser.Dsl_accessObjectMethodContext ctx) {
		Object object = visit(ctx.dsl_objectAccess());
		String methodName = ctx.dsl_methodInvoke().dsl_methodName().getText();
		if (null == ctx.dsl_methodInvoke().dsl_expressions()) {
			return ReflectionHelper.invokeMethod(object, methodName);
		} else {
			List<TemplateParser.Dsl_expressionContext> expressions = ctx.dsl_methodInvoke().dsl_expressions().dsl_expression();
			Object[] arguments = new Object[expressions.size()];
			for (int i = 0; i < expressions.size(); ++i) {
				arguments[i] = visit(expressions.get(i));
			}
			return ReflectionHelper.invokeMethod(object, methodName, arguments);
		}
	}

	@Override
	public Object visitDsl_accessObjectField(TemplateParser.Dsl_accessObjectFieldContext ctx) {
		Object object = visit(ctx.dsl_objectAccess());
		String field = ctx.dsl_field().getText();
		return ReflectionHelper.invokeField(object, field);
	}

	@Override
	public Object visitDsl_paramExpression(TemplateParser.Dsl_paramExpressionContext ctx) {
		String reference = ctx.dsl_param().getText();
		Optional<Object> result = this.context.getParameter(reference);
		return result.orElseThrow(() -> new IllegalArgumentException("can't resolve argument: " + reference));
	}

	@Override
	public Object visitDsl_literalExpression(TemplateParser.Dsl_literalExpressionContext ctx) {
		return visit(ctx.dsl_literal());
	}

	@Override
	public Object visitDsl_objectExpression(TemplateParser.Dsl_objectExpressionContext ctx) {
		return visit(ctx.dsl_objectAccess());
	}

	@Override
	public Object visitDsl_methodInvokeExpression(TemplateParser.Dsl_methodInvokeExpressionContext ctx) {
		return visitDsl_methodInvoke(ctx.dsl_methodInvoke());
	}

	private static final int INTEGER_MAX_LENGTH = 10;

	private static final char FIRST_CHAR_OF_MAX_INT = '3';

	@Override
	public Object visitDsl_numberLiteral(TemplateParser.Dsl_numberLiteralContext ctx) {
		String text = ctx.dsl_number().getText();
		// fast path
		if (text.length() < INTEGER_MAX_LENGTH) {
			return Integer.parseInt(text);
		}

		// fast path Integer.MAX_VALUE starts with 2
		if (text.length() == INTEGER_MAX_LENGTH && text.charAt(0) > FIRST_CHAR_OF_MAX_INT) {
			return Long.parseLong(text);
		}

		long number = Long.parseLong(text);
		if (number <= Integer.MAX_VALUE) {
			return (int) number;
		} else {
			return number;
		}
	}

	@Override
	public Object visitDsl_stringLiteral(TemplateParser.Dsl_stringLiteralContext ctx) {
		Token start = ctx.dsl_typedString().getStart();
		Token stop = ctx.dsl_typedString().getStop();
		return this.stream.getText(start, stop);
	}
}