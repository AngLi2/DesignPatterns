/**
 * 
 */
package visitor.demo.doubledispatch;

/**
 * @author Ang Li
 *
 */
public class OldActor extends AbstractActor{

	public void act(KungFuRole kungFuRole) {
		System.out.println("Too old to play Kungfu");
	}
}
