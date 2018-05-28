package we.template;

@FunctionalInterface
public interface SupplierThrow<T> {
	T get() throws Exception;

	default T getOrThrow() {
		try {
			return get();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}