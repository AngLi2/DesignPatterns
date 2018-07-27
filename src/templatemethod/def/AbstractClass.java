/**
 * 
 */
package templatemethod.def;

/**
 * @author Ang Li
 *
 */
public abstract class AbstractClass {

	protected abstract void doSomething();
	
	protected abstract void doAnything();
	
	public void templateMethod() {
		//TODO
		this.doAnything();
		this.doSomething();
	}
}
