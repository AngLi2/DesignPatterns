/**
 * 
 */
package bridge.def;

/**
 * @author Ang Li
 *
 */
public abstract class Abstraction {

	private Implementor implementor;

	public Abstraction(Implementor implementor) {
		this.implementor = implementor;
	}

	public void request() {
		this.implementor.doSomething();
	}

	public Implementor getImplementor() {
		return this.implementor;
	}
}
