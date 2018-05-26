package we.template.segment;

import we.template.function.Function;
import we.template.reflection.ReflectionHelper;
import we.template.function.RuntimeManager;
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
  public Object visitOCall(TemplateParser.OCallContext ctx) {
    return visitTinyCall(ctx.tinyCall());
  }

  @Override
  public Object visitOArgCall(TemplateParser.OArgCallContext ctx) {
    Object target = visit(ctx.tinyObject());
    String methodName = ctx.IDENTIFIER().getText();

    List<TemplateParser.TinyExprContext> exprContexts = ctx.tinyExpr();
    Object[] args = new Object[exprContexts.size()];
    for (int i = 0; i < exprContexts.size(); ++i) {
      args[i] = visit(exprContexts.get(i));
    }

    return ReflectionHelper.invokeMethod(target, methodName, args);
  }

  @Override
  public Object visitONonArgCall(TemplateParser.ONonArgCallContext ctx) {
    Object target = visit(ctx.tinyObject());
    String methodName = ctx.IDENTIFIER().getText();

    return ReflectionHelper.invokeMethod(target, methodName);
  }

  @Override
  public Object visitOAccess(TemplateParser.OAccessContext ctx) {
    Object target = visit(ctx.tinyObject());
    String fieldName = ctx.IDENTIFIER().getText();

    return ReflectionHelper.invokeField(target, fieldName);
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
    if (null != (function = RuntimeManager.function(symbol, ReflectionHelper.getReplacedTypes(args)))) {
      return function.call(args);
    }
    throw new RuntimeException("function not found " + symbol);
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