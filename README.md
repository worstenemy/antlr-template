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

##
