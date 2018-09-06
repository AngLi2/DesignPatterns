/**
 * 
 */
package state.demo;

/**
 * @author Ang Li
 *
 */
public class RunningState extends LifeState{
	
	public void close() {
		// do nothing
	}
	
	public void open() {
		// do nothing
	}
	
	public void run() {
		System.out.println("Elevator Running");
	}

	public void stop() {
		super.context.setLifeState(Context.STOPPING_STATE);
		super.context.getLifeState().stop();
	}
}
