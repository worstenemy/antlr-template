package we.template;

@FunctionalInterface
public interface SupplierThrow<T> {
	T get() throws Exception;
}