package we.template.evaluator.function.impl;

import we.template.evaluator.function.EvaluationContext;
import we.template.evaluator.function.Function;
import we.template.evaluator.function.Registry;

public enum GlobalContext implements EvaluationContext, Registry {
	context {
		@Override
		public void register(Class<?> function) {
			CONTEXT.register(function);
		}

		@Override
		public void register(String name, Object value) {
			CONTEXT.register(name, value);
		}

		@Override
		public Function getFunction(String name, Object[] args) {
			return CONTEXT.getFunction(name, args);
		}

		@Override
		public Object getParameter(String name) {
			return CONTEXT.getParameter(name);
		}
	};

	private final static MappedContext CONTEXT = new MappedContext();

	static {
		context.register(BuildInFunctions.class);
	}
}