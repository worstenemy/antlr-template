package we.template;

import java.util.Objects;

public class Pair<T, U> {
  private final T first;

  private final U second;

  private Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public static <T, U> Pair<T, U> valueOf(T first, U second) {
    return new Pair<>(first, second);
  }

  public T getFirst() {
    return this.first;
  }

  public U getSecond() {
    return this.second;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.first, this.second);
  }

  @Override
  public boolean equals(Object obj) {
    if (null == obj || !(obj instanceof Pair)) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    Pair that = (Pair) obj;
    return this.first.equals(that.first) &&
      this.second.equals(that.second);
  }
}