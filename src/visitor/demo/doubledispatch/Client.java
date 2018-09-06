/**
 * 
 */
package visitor.demo.doubledispatch;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		AbstractActor actor = new OldActor();
		
		Role role = new KungFuRole();
		
		role.accept(actor);
		
		actor.act(role);
	}
}
