/**
 * 
 */
package observer.def;

import java.util.Vector;

/**
 * @author Ang Li
 *
 */
public abstract class Subject {

	private Vector<Observer> observerVector = new Vector<Observer>();

	public void addObserverList(Observer observer) {
		this.observerVector.add(observer);
	}

	public void delObserverList(Observer observer) {
		this.observerVector.remove(observer);
	}

	public void notifyObserverList() {
		for (Observer observer : this.observerVector) {
			observer.update();
		}
	}
}
