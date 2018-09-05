package we.template.evaluator.function;

public interface Registry {
	void register(Class<?> function);

	void register(String name, Object value);
}