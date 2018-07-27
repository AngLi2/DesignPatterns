/**
 * 
 */
package abstractfactory.def;

/**
 * @author Ang Li
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractFactory factory1 = new Factory1();
		AbstractFactory factory2 = new Factory2();
		
		AbstractProductA a1 = factory1.createProductA();
		AbstractProductA a2 = factory2.createProductA();
		AbstractProductB b1 = factory1.createProductB();
		AbstractProductB b2 = factory2.createProductB();
		
		a1.doSomething();
		a2.doSomething();
		b1.doSomething();
		b2.doSomething();
	}
}
