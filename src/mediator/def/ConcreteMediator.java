/**
 * 
 */
package mediator.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteMediator extends Mediator{

	public void doSomething1() {
		super.colleague1.selfMethod1();
		super.colleague2.selfMethod2();
	}
	
	public void doSomething2() {
		super.colleague1.selfMethod1();
		super.colleague2.selfMethod2();
	}
}
