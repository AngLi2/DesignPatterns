/**
 * 
 */
package visitor.demo.multivisitor;

/**
 * @author Ang Li
 *
 */
public class ShowVisitor implements IShowVisitor {

	private String info = "";

	public void report() {
		System.out.println(this.info);
	}

	public void visit(CommonEmployee commonEmployee) {
		this.info += this.getBasicInfo(commonEmployee) + "Job: " + commonEmployee.getJob() + "\t\n";
	}

	public void visit(Manager manager) {
		this.info += this.getBasicInfo(manager) + "Performance: " + manager.getPerformance() + "\t\n";
	}

	private String getBasicInfo(Employee employee) {
		String info = "Name: " + employee.getName() + "\t";
		info += "Sex: " + (employee.getSex() == Employee.MALE ? "Male" : "Female") + "\t";
		info += "Salary: " + employee.getSalary() + "\t";
		return info;
	}
}
