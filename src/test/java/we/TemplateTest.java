package we;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import we.template.evaluator.expression.Expression;
import we.template.evaluator.expression.ExpressionBuilder;
import we.template.evaluator.function.impl.GlobalContext;

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
}