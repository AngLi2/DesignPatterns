/**
 * 
 */
package proxy.def.dynamic;

import java.lang.reflect.InvocationHandler;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		//With DynamicProxy

		Subject subject = new RealSubject();

		InvocationHandler invocationHandler = new MyInvocationHandler(subject);

		Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
				subject.getClass().getInterfaces(), invocationHandler);

		proxy.doSomething("finish");
		
		//With Subject DynamicProxy
		
		proxy = SubjectDynamicProxy.newProxyInstance(subject);
		
		proxy.doSomething("finish");
	}
}
