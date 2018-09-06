/**
 * 
 */
package state.def;

/**
 * @author Ang Li
 *
 */
public class Context {

	public final static State STATE1 = new ConcreteState1();
	public final static State STATE2 = new ConcreteState2();
	
	private State currentState;

	/**
	 * @return the currentState
	 */
	public State getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}
	
	public void handle1() {
		this.currentState.handle1();
	}
	
	public void handle2() {
		this.currentState.handle2();
	}
	
}