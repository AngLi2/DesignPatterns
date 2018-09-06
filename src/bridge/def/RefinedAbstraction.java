/**
 * 
 */
package bridge.def;

/**
 * @author Ang Li
 *
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	public void request() {
		// TODO
		super.request();
		super.getImplementor().doAnything();
	}
}
