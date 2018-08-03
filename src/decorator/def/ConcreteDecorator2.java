/**
 * 
 */
package decorator.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	private void method2() {
		System.out.println("Method2 Decorate");
	}
	
	public void operate() {
		super.operate();
		this.method2();
	}
}
