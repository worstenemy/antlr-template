package we.template.reflection;

import we.template.function.FunctionDescriptor;

import java.util.Arrays;
import java.util.Objects;

public class MethodDescriptor {
  private final FunctionDescriptor descriptor;

  private final Class<?> clazz;

  public MethodDescriptor(Class<?> clazz, String methodName, Class<?>... actualTypes) {
    Objects.requireNonNull(clazz, "class cannot be null");
    this.clazz = clazz;
    this.descriptor = new FunctionDescriptor(methodName, actualTypes);
  }

  public Class<?> getClazz() {
    return clazz;
  }

  public String getMethodName() {
    return descriptor.getMethodName();
  }

  public Class<?>[] getActualTypes() {
    return descriptor.getActualTypes();
  }

  @Override
  public int hashCode() {
    return 31 * this.clazz.hashCode() ^ this.descriptor.hashCode();
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
      this.descriptor.equals(that.descriptor);
  }
}