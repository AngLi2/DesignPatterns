/**
 * 
 */
package visitor.def.origin;

/**
 * @author Ang Li
 *
 */
public abstract class Element {

	public abstract void doSomething();
	
	public abstract void accept(IVisitor visitor);
	
}
