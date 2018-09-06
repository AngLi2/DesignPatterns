/**
 * 
 */
package state.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteState2 extends State{

	public void handle1() {
		super.context.setCurrentState(Context.STATE1);
		super.context.handle1();
	}
	
	public void handle2() {
		
	}
}
