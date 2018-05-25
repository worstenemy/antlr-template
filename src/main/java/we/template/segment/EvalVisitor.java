package we.template.segment;

import we.template.Function;
import we.template.Reflection;
import we.template.RuntimeManager;
import we.template.antlr.TemplateBaseVisitor;
import we.template.antlr.TemplateParser;

import java.util.List;

public class EvalVisitor extends TemplateBaseVisitor<Object> {
	/************************************* field and method *************************************/

	@Override
	public Object visitOSymbol(TemplateParser.OSymbolContext ctx) {
		String symbol = ctx.IDENTIFIER().getText();
		return RuntimeManager.arg(symbol);
	}

	@Override
	public Object visitOArgCall(TemplateParser.OArgCallContext ctx) {
		Object target = visit(ctx.tinyObject());
		String method = ctx.IDENTIFIER().getText();

		List<TemplateParser.TinyExprContext> exprContexts = ctx.tinyExpr();
		Object[] args = new Object[exprContexts.size()];
		for (int i = 0; i < exprContexts.size(); ++i) {
			args[i] = visit(exprContexts.get(i));
		}

		return Reflection.invokeMethod(target, method, args);
	}

	@Override
	public Object visitONonArgCall(TemplateParser.ONonArgCallContext ctx) {
		Object target = visit(ctx.tinyObject());
		String method = ctx.IDENTIFIER().getText();

		return Reflection.invokeMethod(target, method);
	}

	@Override
	public Object visitOAccess(TemplateParser.OAccessContext ctx) {
		Object target = visit(ctx.tinyObject());
		String field = ctx.IDENTIFIER().getText();

		return Reflection.getField(target, field);
	}

	/***************************************** function *****************************************/
	@Override
	public Object visitTinyCall(TemplateParser.TinyCallContext ctx) {
		String symbol = ctx.IDENTIFIER().getText();
		List<TemplateParser.TinyExprContext> contexts = ctx.tinyExpr();
		Object[] args = new Object[contexts.size()];
		for (int i = 0; i < contexts.size(); ++i) {
			args[i] = visit(contexts.get(i));
		}
		Function function;
		if (null != (function = RuntimeManager.function(symbol))) {
			return function.call(args);
		}
		throw new RuntimeException("function not found");
	}

	@Override
	public Object visitECall(TemplateParser.ECallContext ctx) {
		return visitTinyCall(ctx.tinyCall());
	}

	@Override
	public Object visitEId(TemplateParser.EIdContext ctx) {
		String symbol = ctx.IDENTIFIER().getText();
		return RuntimeManager.arg(symbol);
	}

	@Override
	public Object visitEInt(TemplateParser.EIntContext ctx) {
		return Integer.valueOf(ctx.INTEGER_VALUE().getText());
	}

	@Override
	public Object visitEStr(TemplateParser.EStrContext ctx) {
		return ctx.QUOTED_IDENTIFIER().getText();
	}
}