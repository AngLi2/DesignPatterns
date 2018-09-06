/**
 * 
 */
package memento.def.safeoriginator;

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
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	public IMemento createMemento() {
		return new Memento(this.state);
	}

	public void restoreMemento(IMemento memento) {
		this.setState(((Memento) memento).getState());
	}

	private class Memento implements IMemento {

		private String state;

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
		@SuppressWarnings("unused")
		public void setState(String state) {
			this.state = state;
		}

		public Memento(String state) {
			this.state = state;
		}

	}
}
