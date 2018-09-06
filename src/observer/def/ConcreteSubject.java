/**
 * 
 */
package observer.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteSubject extends Subject {

	public void doSomething() {

		/*
		 * do something
		 */
		super.notifyObserverList();
	}
}
