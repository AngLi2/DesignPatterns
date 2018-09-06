/**
 * 
 */
package state.demo;

/**
 * @author Ang Li
 *
 */
public class ClosingState extends LifeState{

	public void close() {
		System.out.println("Elevator Closing");
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
		super.context.setLifeState(Context.STOPPING_STATE);
		super.context.getLifeState().stop();
	}
}
