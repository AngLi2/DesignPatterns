/**
 * 
 */
package memento.demo.origin;

/**
 * @author Ang Li
 *
 */
public class Boy {

	private String state = "";
	
	public void changeState() {
		this.state = "Bad Mood";
	}
	
	public String getState() {
		return this.state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Memento createMemento() {
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
