/**
 * 
 */
package visitor.demo.multivisitor;

/**
 * @author Ang Li
 *
 */
public class TotalVisitor implements ITotalVisitor {

	private final static int MANAGER_COEFFICIENT = 5;
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

	private int commonTotalSalaray = 0;
	private int managerTotalSalary = 0;

	public void getTotalSalary() {
		System.out.println("Total Salary is: " + (this.commonTotalSalaray + this.managerTotalSalary));
	}

	public void visit(CommonEmployee commonEmployee) {
		this.commonTotalSalaray += commonEmployee.getSalary() * COMMONEMPLOYEE_COEFFICIENT;
	}

	public void visit(Manager manager) {
		this.managerTotalSalary += manager.getSalary() * MANAGER_COEFFICIENT;
	}
}
