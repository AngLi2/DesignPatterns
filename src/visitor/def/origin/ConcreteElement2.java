/**
 * 
 */
package visitor.def.origin;

/**
 * @author Ang Li
 *
 */
public class ConcreteElement2 extends Element{

	public void doSomething() {
		
	}
	
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
}
