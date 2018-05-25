package we.template.reflection;

import java.util.Arrays;
import java.util.Objects;

public class MethodDescriptor {
  private static final Class<?>[] EMPTY = {};

  private final Class<?> clazz;

  private final String methodName;

  private final Class<?>[] actualTypes;

  public MethodDescriptor(Class<?> clazz, String methodName, Class<?>... actualTypes) {
    Objects.requireNonNull(clazz, "class cannot be null");
    Objects.requireNonNull(methodName, "method name cannot be null");
    this.clazz = clazz;
    this.methodName = methodName;
    if (null == actualTypes) {
      this.actualTypes = EMPTY;
    } else {
      this.actualTypes = actualTypes;
    }
  }

  public Class<?> getClazz() {
    return clazz;
  }

  public String getMethodName() {
    return methodName;
  }

  public Class<?>[] getActualTypes() {
    return actualTypes;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.clazz, this.methodName, this.actualTypes);
  }

  @Override
  public boolean equals(Object obj) {
    if (null == obj || !(obj instanceof MethodDescriptor)) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    MethodDescriptor that = (MethodDescriptor) obj;
    return this.clazz.equals(that.clazz) &&
      this.methodName.equals(that.methodName) &&
      Arrays.equals(this.actualTypes, that.actualTypes);
  }
}