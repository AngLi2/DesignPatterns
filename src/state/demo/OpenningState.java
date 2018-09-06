/**
 * 
 */
package state.demo;

/**
 * @author Ang Li
 *
 */
public class OpenningState extends LifeState{

	public void close() {
		super.context.setLifeState(Context.CLOSING_STATE);
		super.context.getLifeState().close();
	}
	
	public void open() {
		System.out.println("Elevator Openning");
	}
	
	public void run() {
		// do nothing
	}

	public void stop() {
		// do nothing
	}
}
