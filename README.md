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
String eval = ParseHelper.compile(template).eval();
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
String eval = ParseHelper.compile(template).eval();
```
and the result is:
```
"1 add 3 is 4"
```
also, we support override methods:
```
String template = "a add b is ${add(a, b)}";
```
invoke the parser and get the result:
```
"a add b is hello worldthis is test";
```

## parse members
