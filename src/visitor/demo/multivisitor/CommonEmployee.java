/**
 * 
 */
package visitor.demo.multivisitor;

/**
 * @author Ang Li
 *
 */
public class CommonEmployee extends Employee {

	private String job;

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job
	 *            the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
	
}
