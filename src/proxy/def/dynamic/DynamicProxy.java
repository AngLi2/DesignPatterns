/**
 * 
 */
package proxy.def.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Ang Li
 *
 */
public class DynamicProxy {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {

		// Find JoinPoint
		if (true) {
			// Execute some before methods
			(new BeforeAdvice()).exec();
		}

		// Execute target, return
		return (T) Proxy.newProxyInstance(loader, interfaces, h);
	}
}
