/**
 * 
 */
package visitor.demo.multivisitor;

/**
 * @author Ang Li
 *
 */
public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);

	public void visit(Manager manager);

}
