# antlr-template
## **for example:**

```

public class Function {
  String concat(String a, String b) {
    return a + b;
  }
}

String template = "select ${a} from ${b} where c >= '${concat(a, concat(a, b))}'"

RuntimeManager.setArg("a", "hello world");
RuntimeManager.setArg("b", "this is test");

String parsed = ParseHelper.compile(template).eval();

Assert.assertEquals(parsed, "select hello world from this is test where c >= 'hello worldhello worldthis is test'");
```
