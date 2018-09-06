/**
 * 
 */
package facade.def;

/**
 * @author Ang Li
 *
 */
public class Facade {

	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private Context context = new Context();
	
	public void doSomethingA() {
		this.a.doSomethingA();
	}
	
	public void doSomethingB() {
		this.b.doSomethingB();
	}
	
	public void doSomethingC() {
		this.context.complexMethod();
	}
	
}
