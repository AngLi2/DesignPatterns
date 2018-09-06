/**
 * 
 */
package visitor.demo.doubledispatch;

/**
 * @author Ang Li
 *
 */
public abstract class AbstractActor {

	public void act(Role role) {
		System.out.println("Actor can do anything");
	}
	
	public void act(KungFuRole kungFuRole) {
		System.out.println("Actor can play Kungfu");
	}
}
