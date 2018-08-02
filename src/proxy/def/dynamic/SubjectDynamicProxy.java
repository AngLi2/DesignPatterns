/**
 * 
 */
package proxy.def.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @author Ang Li
 *
 */
public class SubjectDynamicProxy extends DynamicProxy{
	
	public static <T> T newProxyInstance(Subject subject) {
		
		ClassLoader classLoader = subject.getClass().getClassLoader();
		
		Class<?>[] classes = subject.getClass().getInterfaces();
		
		InvocationHandler invocationHandler = new MyInvocationHandler(subject);
		
		return newProxyInstance(classLoader,classes,invocationHandler);
	}

}
