/**
 * 
 */
package observer.def;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		Observer observer = new ConcreteObserver();

		ConcreteSubject subject = new ConcreteSubject();

		subject.addObserverList(observer);

		subject.doSomething();
	}

}
