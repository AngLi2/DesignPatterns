/**
 * 
 */
package decorator.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	private void method1() {
		System.out.println("Method1 Decorate");
	}
	
	public void operate() {
		this.method1();
		super.operate();
	}
}
