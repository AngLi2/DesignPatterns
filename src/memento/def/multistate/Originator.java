/**
 * 
 */
package memento.def.multistate;

/**
 * @author Ang Li
 *
 */
public class Originator {

	private String state1 = "";
	private String state2 = "";
	private String state3 = "";

	/**
	 * @return the state1
	 */
	public String getState1() {
		return state1;
	}

	/**
	 * @param state1
	 *            the state1 to set
	 */
	public void setState1(String state1) {
		this.state1 = state1;
	}

	/**
	 * @return the state2
	 */
	public String getState2() {
		return state2;
	}

	/**
	 * @param state2
	 *            the state2 to set
	 */
	public void setState2(String state2) {
		this.state2 = state2;
	}

	/**
	 * @return the state3
	 */
	public String getState3() {
		return state3;
	}

	/**
	 * @param state3
	 *            the state3 to set
	 */
	public void setState3(String state3) {
		this.state3 = state3;
	}

	public Memento createMemento() {
		return new Memento(BeanUtils.backupProp(this));
	}

	public void restoreMemento(Memento memento) {
		BeanUtils.restoreProp(this, memento.getStateMap());
	}

	public String toString() {
		return "state1 = " + state1 + "\nstate2 = " + state2 + "\nstate3 = " + state3;
	}

}
