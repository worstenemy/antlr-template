package we.template.evaluator.function;

public abstract class Function {
	public abstract Object call(Object... args);

	public abstract boolean isCompatible(Class<?>[] types);
}