package we;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import we.template.ParseHelper;
import we.template.RuntimeManager;
import we.template.SegmentsEvalAware;

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

  @Before
  public void setUp() {
    RuntimeManager.setArgs("a", "hello world");
    RuntimeManager.setArgs("b", "this is test");
    RuntimeManager.setFunctions(Function.class);
  }

  @Test
  public void test_arg_success() {
    String template = "${a}";
    SegmentsEvalAware aware = ParseHelper.compile(template);
    Assert.assertEquals(aware.eval(), "hello world");
  }

  @Test
  public void test_function_add_success() {
    String template = "${add(1, 2)}";
    SegmentsEvalAware aware = ParseHelper.compile(template);
    Assert.assertEquals(aware.eval(), "3");
  }

  @Test
  public void test_function_concat_success() {
    String template = "${concat(a, concat(a, b))}";
    SegmentsEvalAware aware = ParseHelper.compile(template);
    Assert.assertEquals(aware.eval(), "hello worldhello worldthis is test");
  }

  @Test
  public void test_template() {
    String template = "select ${a} from ${b} where c >= '${add(1, 10000)}'";
    SegmentsEvalAware aware = ParseHelper.compile(template);
    Assert.assertEquals(aware.eval(), "select hello world from this is test where c >= '10001'");
  }
}