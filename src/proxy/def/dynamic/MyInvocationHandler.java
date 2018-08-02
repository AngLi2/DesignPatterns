/**
 * 
 */
package proxy.def.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ang Li
 *
 */
public class MyInvocationHandler implements InvocationHandler{

	private Object target = null;
	
	public MyInvocationHandler(Object obj) {
		this.target = obj;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		return method.invoke(this.target, args);
	}
}
