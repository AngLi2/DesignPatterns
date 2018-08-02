/**
 * 
 */
package mediator.def;

/**
 * @author Ang Li
 *
 */
public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
}
