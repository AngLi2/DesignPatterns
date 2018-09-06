/**
 * 
 */
package state.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteState1 extends State{

	public void handle1() {
		
	}
	
	public void handle2() {
		super.context.setCurrentState(Context.STATE2);
		super.context.handle2();
	}
}
