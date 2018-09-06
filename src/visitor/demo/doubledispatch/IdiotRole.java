/**
 * 
 */
package visitor.demo.doubledispatch;

/**
 * @author Ang Li
 *
 */
public class IdiotRole implements Role{

	public void accept(AbstractActor actor) {
		actor.act(this);
	}
}
