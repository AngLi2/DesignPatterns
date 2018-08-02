/**
 * 
 */
package proxy.def.dynamic;

/**
 * @author Ang Li
 *
 */
public class RealSubject implements Subject{

	public void doSomething(String str) {
		System.out.println("do something! ---->" +str);
	}
}
