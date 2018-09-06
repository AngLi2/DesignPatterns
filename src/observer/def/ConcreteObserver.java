/**
 * 
 */
package observer.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteObserver implements Observer {

	public void update() {
		System.out.println("Receive information, and Handle the information");
	}
}
