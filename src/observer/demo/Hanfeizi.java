/**
 * 
 */
package observer.demo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Ang Li
 *
 */
public class Hanfeizi extends Observable implements IHanfeizi {

	private ArrayList<Observer> observerList = new ArrayList<Observer>();

	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}

	public void delObserver(Observer observer) {
		this.observerList.remove(observer);
	}

	public void notifyObservers(String context) {
		for (Observer observer : this.observerList) {
			observer.update(this, context);
		}
	}

	public void haveBreakfast() {
		System.out.println("Hanfeizi: Having breakfast");
		super.setChanged();
		notifyObservers("Hanfeizi is having breakfast");
	}

	public void haveFun() {
		System.out.println("Hanfeizi is having fun");
		super.setChanged();
		notifyObservers("Hanfeizi is having fun");
	}
}
