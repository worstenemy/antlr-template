# antlr-template
## **for example:**

```

public class Function {
  String concat(String a, String b) {
    return a + b;
  }
}

String template = "select ${a} from ${b} where c >= '${concat(a, concat(a, b))}'"

RuntimeManager.setArgs("a", "hello world");
RuntimeManager.setArgs("b", "this is test");
RuntimeManager.setFunctions(Function.class);

String parsed = ParseHelper.compile(template).eval();

Assert.assertEquals(parsed, "select hello world from this is test where c >= 'hello worldhello worldthis is test'");

public class Foo {
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

Foo foo1 = new Foo("hello world", null);
Foo foo2 = new Foo("this is test", foo1);
RuntimeManager.setArgs("foo", foo2);

String template = "${foo.next.a.length()}";
SegmentsEvalAware aware = ParseHelper.compile(template);

Assert.assertEquals(aware.eval(), "11");

```
