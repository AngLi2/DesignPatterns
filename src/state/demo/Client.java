/**
 * 
 */
package state.demo;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		context.setLifeState(new ClosingState());
		
		context.open();
		
		context.close();
		
		context.run();
		
		context.stop();
	}
}
