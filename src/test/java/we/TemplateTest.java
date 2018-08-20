package we;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import we.template.context.impl.DefaultEvaluationContext;
import we.template.evaluator.impl.TemplateEvaluator;

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

	public static class Foo {
		private final String a;
		private final Foo next;

		public Foo(String a, Foo next) {
			this.a = a;
			this.next = next;
		}

		public String getA() {
			return a;
		}

		public Foo getNext() {
			return next;
		}
	}

	@Before
	public void setUp() {
		DefaultEvaluationContext.registerGlobalArg("a", "hello world");
		DefaultEvaluationContext.registerGlobalArg("b", "this is test");
		DefaultEvaluationContext.registerGlobalMethod(Function.class);
	}

	@Test
	public void test_arg_success() {
		String template = "${a}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "hello world");
	}

	@Test
	public void test_function_add_success() {
		String template = "${add(1, 2)}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "3");
	}

	@Test
	public void test_function_concat_success() {
		String template = "${concat(a, concat(a, b)).substring(0, 5)}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "hello");
	}

	@Test
	public void test_template() {
		String template = "select ${a} from ${b} where c >= '${add(1, 10000)}'";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "select hello world from this is test where c >= '10001'");
	}

	@Test
	public void test_template_1() {
		String template = "${concat(a.substring(0, 5), b)}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "hellothis is test");
	}

	@Test
	public void test_object() {
		String template = "${a.length()}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "11");
	}

	@Test
	public void test_object_access() {
		Foo foo1 = new Foo("hello world", null);
		Foo foo2 = new Foo("this is test", foo1);
		DefaultEvaluationContext.registerGlobalArg("foo", foo2);

		String template = "${foo.next.a.length()}";
		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "11");
	}

	@Test
	public void test_object_equals() {
		String template = "${a.equals(b)}";

		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "false");
	}

	@Test
	public void test_object_subString() {
		String template = "${a.substring(0, 1)}";

		String actual = TemplateEvaluator.create().evaluate(template);
		Assert.assertEquals(actual, "h");
	}

	@Test(expected = RuntimeException.class)
	public void test_missing_method() {
		String template = "${a.size()}";
		TemplateEvaluator.create().evaluate(template);
	}
}