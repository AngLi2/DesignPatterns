/**
 * 
 */
package proxy.demo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ang Li
 *
 */
public class GamePlayIH implements InvocationHandler{

	Class<?> clz = null;
	
	Object object = null;
	
	public GamePlayIH(Object object) {
		this.object = object;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		Object result = method.invoke(this.object, args);
		if(method.getName().equalsIgnoreCase("login")) {
			System.out.println("Someone is logging in using my account");
		}
		return result;
	}
}
