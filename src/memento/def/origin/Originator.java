/**
 * 
 */
package memento.def.origin;

/**
 * @author Ang Li
 *
 */
public class Originator {

	private String state = "";

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
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
