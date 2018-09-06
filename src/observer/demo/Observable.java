/**
 * 
 */
package observer.demo;

/**
 * @author Ang Li
 *
 */
public interface Observable {

	public void addObserver(Observer observer);

	public void delObserver(Observer observer);

	public void notifyObservers(String context);
}
