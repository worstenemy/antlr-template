package we.template.evaluator.function;

public interface Finder {
	Function getFunction(String name, Object[] args);

	Object getParameter(String name);
}