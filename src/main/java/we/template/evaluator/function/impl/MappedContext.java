package we.template.evaluator.function.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import we.template.evaluator.function.Finder;
import we.template.evaluator.function.Function;
import we.template.evaluator.function.Registry;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class MappedContext implements Finder, Registry {
	private static final Logger LOGGER = LoggerFactory.getLogger(MappedContext.class);

	private final ConcurrentMap<FunctionDescriptor, Function> functionMap =
			new ConcurrentHashMap<>(128);

	private final ConcurrentMap<String, CopyOnWriteArrayList<Function>> functionNamingMap =
			new ConcurrentHashMap<>(128);

	private final ConcurrentMap<String, Object> parameterMap =
			new ConcurrentHashMap<>(128);

	@Override
	public void register(Class<?> function) {
		if (null == function) {
			return;
		}
		Method[] methods = function.getDeclaredMethods();
		if (0 == methods.length) {
			return;
		}
		Object instance = newInstance(function);
		if (null == instance) {
			return;
		}
		for (Method method : methods) {
			FunctionDescriptor descriptor = new FunctionDescriptor(method.getName(), method.getParameterTypes());
			Function javaMethod = this.functionMap.computeIfAbsent(descriptor, desc -> new JavaMethod(method, instance, desc));
			CopyOnWriteArrayList<Function> functions = this.functionNamingMap.computeIfAbsent(method.getName(), ignored -> new CopyOnWriteArrayList<>());
			functions.add(javaMethod);
		}
	}

	private Object newInstance(Class<?> function) {
		try {
			return function.newInstance();
		} catch (Exception e) {
			LOGGER.error("error create instance " + function.getSimpleName());
			return null;
		}
	}

	@Override
	public Function getFunction(String name, Object[] args) {
		FunctionDescriptor descriptor = new FunctionDescriptor(name, args);
		Function function = this.functionMap.get(descriptor);
		if (null == function) {
			return getFunction(descriptor);
		}
		return function;
	}

	private Function getFunction(FunctionDescriptor descriptor) {
		CopyOnWriteArrayList<Function> functions = this.functionNamingMap.get(descriptor.getMethodName());
		if (null == functions) {
			return null;
		}
		for (Function function : functions) {
			if (function.isCompatible(descriptor.getActualTypes())) {
				this.functionMap.putIfAbsent(descriptor, function);
				return function;
			}
		}
		return null;
	}

	@Override
	public Object getParameter(String name) {
		return this.parameterMap.get(name);
	}

	@Override
	public void register(String name, Object value) {
		if (null == name || null == value) {
			return;
		}
		this.parameterMap.put(name, value);
	}
}