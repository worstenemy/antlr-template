package we.template;

import java.lang.reflect.Method;

public class JavaMethod extends Function {
  private final Method method;

  private final Object instance;

  public JavaMethod(Method method, Object instance) {
    this.method = method;
    this.instance = instance;
  }

  @Override
  public Object call(Object... args) {
    try {
      return this.method.invoke(this.instance, args);
    } catch (Exception e) {
      throw new RuntimeException("invoke method error: " + e.getMessage());
    }
  }
}