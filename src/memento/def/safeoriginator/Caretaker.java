/**
 * 
 */
package memento.def.safeoriginator;

/**
 * @author Ang Li
 *
 */
public class Caretaker {

	private IMemento memento;

	/**
	 * @return the memento
	 */
	public IMemento getMemento() {
		return memento;
	}

	/**
	 * @param memento the memento to set
	 */
	public void setMemento(IMemento memento) {
		this.memento = memento;
	}
	
	
	
}
