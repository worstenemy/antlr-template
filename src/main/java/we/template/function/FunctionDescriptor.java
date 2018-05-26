package we.template.function;

import java.util.Arrays;
import java.util.Objects;

public class FunctionDescriptor {
  private static final Class<?>[] EMPTY = {};

  private final String methodName;

  private final Class<?>[] actualTypes;

  public FunctionDescriptor(String methodName, Class<?>[] actualTypes) {
    Objects.requireNonNull(methodName, "method name cannot be null");
    this.methodName = methodName;
    this.actualTypes = actualTypes == null ? EMPTY : actualTypes;
  }

  public String getMethodName() {
    return methodName;
  }

  public Class<?>[] getActualTypes() {
    return actualTypes;
  }

  @Override
  public int hashCode() {
    return 31 * this.methodName.hashCode() ^ Arrays.hashCode(this.actualTypes);
  }

  @Override
  public boolean equals(Object obj) {
    if (null == obj || !(obj instanceof FunctionDescriptor)) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    FunctionDescriptor that = (FunctionDescriptor) obj;
    return this.methodName.equals(that.methodName) &&
      Arrays.equals(this.actualTypes, that.actualTypes);
  }
}