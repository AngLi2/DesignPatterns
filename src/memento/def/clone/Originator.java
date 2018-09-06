/**
 * 
 */
package memento.def.clone;

/**
 * @author Ang Li
 *
 */
public class Originator implements Cloneable {
	
	private Originator backup;

	private String state = "";

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public void createMemento() {
		this.backup = this.clone();
	}

	public void restoreMemento() {
		this.setState(this.backup.getState());
	}

	protected Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return null;
	}

}
