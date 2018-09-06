/**
 * 
 */
package state.demo;

/**
 * @author Ang Li
 *
 */
public class StoppingState extends LifeState{

	public void close() {
		// do nothing
	}
	
	public void open() {
		super.context.setLifeState(Context.OPENNING_STATE);
		super.context.getLifeState().open();
	}
	
	public void run() {
		super.context.setLifeState(Context.RUNNING_STATE);
		super.context.getLifeState().run();
	}

	public void stop() {
		System.out.println("Elevator Stopping");
	}
	
}
