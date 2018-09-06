/**
 * 
 */
package facade.def;

/**
 * @author Ang Li
 *
 */
public class Context {

	private ClassA a= new ClassA();
	private ClassC c = new ClassC();
	
	public void complexMethod() {
		this.a.doSomethingA();
		this.c.doSomethingC();
	}
}
