package we;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import we.template.evaluator.ParseHelper;
import we.template.evaluator.ParseResult;
import we.template.evaluator.antlr.QueryLexer;
import we.template.evaluator.antlr.QueryParser;
import we.template.evaluator.expression.Expression;
import we.template.evaluator.expression.ExpressionBuilder;
import we.template.evaluator.function.impl.GlobalContext;

import java.util.List;

@RunWith(JUnit4.class)
public class TemplateTest {
	public static class Function {
		public int add(int a, int b) {
			return a + b;
		}

		public String concat(String a, String b) {
			return a + b;
		}
	}

	@Test
	public void test_arg() {
		GlobalContext.context.register("a", "hello world");
		String template = "${a}";
		Expression e = ExpressionBuilder.build(template);
		Assert.assertEquals("hello world", e.evaluate());
	}

	@Test
	public void test_function() {
		GlobalContext.context.register(Function.class);
		String template = "${add(1, 2)}";
		Expression e = ExpressionBuilder.build(template);
		Assert.assertEquals("3", e.evaluate());
	}

	@Test
	public void test_logic() {
		GlobalContext.context.register("abc", "abc");
		GlobalContext.context.register("def", "def");
		String template = "${if(len(abc) > 0 && len(def) > 2,\"\",\" and '\" + abc + \"'\")}";
		Expression e = ExpressionBuilder.build(template);
		Assert.assertEquals("", e.evaluate());
	}

	@Test
	public void test_logic_1() {
		GlobalContext.context.register("abc", "abc");
		GlobalContext.context.register("def", "def");
		String template = "where 1 = 1${if(len(abc) == 0 && len(def) > 2,\"\",\" and '\" + abc + \"'\")}";
		Expression e = ExpressionBuilder.build(template);
		Assert.assertEquals("where 1 = 1 and 'abc'", e.evaluate());
	}

	@Test
	public void test_token_1() {
	  String template = "${a}";
    ParseResult result = ParseHelper.parse("token",
      template,
      QueryParser::new,
      QueryLexer::new,
      QueryParser::query,
      false);
    BufferedTokenStream stream = (BufferedTokenStream) result.getStream();
    List<Token> tokens = stream.getTokens();
    for (Token token : tokens) {
      System.out.println(token);
    }
  }
}