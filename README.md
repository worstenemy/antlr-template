# antlr-template

## parse arguments

there are two arguments:
```
String a = "hello world";
String b = "this is test";

RuntimeManager.setArgs("a", a);
RuntimeManager.setArgs("b", b); // register the arguments you want to parse
```
and you got the template:
```
String template = "${a} to you, ${b}";
```
invoke parser:
```
String eval = new SegmentCompiler(template).eval();
```
and the result is:
```
"hello world to you, this is test"
```

## parse functions

sometimes you want to parse the methods you write, define a class that you want this engine to parse:
```
public class Functions {
  public int add(int a, int b) {
    return a + b;
  }
  
  public String add(String a, String b) {
    return a + b;
  }
}
```
and register this class:
```
RuntimeManager.setFunctions(Functions.class);
```
invoke parser:
```
String template = "1 add 3 is ${add(1, add(1, 2)}";
String eval = new SegmentCompiler(template).eval();
```
and the result is:
```
"1 add 3 is 4"
```
also, we support override methods:
```
String template = "a add b length is ${add(a.substring(1, 2), b)}}";
```
invoke the parser and get the result:
```
"a add b length is ethis is test";
```

## parse members

define a class:
```
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
```
and you can access a member using dot:
```
String template = "the length of foo's next a is ${foo.getNext().a.length()}";
```
and the result is:
```
"the length of foo's next a is 11";
```
