package we.template.context;

public interface EvaluationRegister {
	void registerLocalParameter(String reference, Object value);

	void registerGlobalParameter(String reference, Object value);

	void registerLocalFunction(Class<?> function);

	void registerGlobalFunction(Class<?> function);
}