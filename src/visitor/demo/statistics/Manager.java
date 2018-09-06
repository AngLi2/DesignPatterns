/**
 * 
 */
package visitor.demo.statistics;

/**
 * @author Ang Li
 *
 */
public class Manager extends Employee {

	private String performance;

	/**
	 * @return the performance
	 */
	public String getPerformance() {
		return performance;
	}

	/**
	 * @param performance
	 *            the performance to set
	 */
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
}
