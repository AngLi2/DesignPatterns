/**
 * 
 */
package visitor.demo.statistics;

/**
 * @author Ang Li
 *
 */
public class Visitor implements IVisitor {

	private final static int MANAGER_COEFFICIENT = 5;
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

	private int commonTotalSalaray = 0;
	private int managerTotalSalary = 0;

	private void calManagerSalary(int salary) {
		this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
	}

	private void calCommonSalary(int salary) {
		this.commonTotalSalaray += salary * COMMONEMPLOYEE_COEFFICIENT;
	}

	public int getTotalSalary() {
		return this.managerTotalSalary + this.commonTotalSalaray;
	}

	public void visit(CommonEmployee commonEmployee) {
		calCommonSalary(commonEmployee.getSalary());
		System.out.println(this.getCommonEmployee(commonEmployee));
	}

	public void visit(Manager manager) {
		calManagerSalary(manager.getSalary());
		System.out.println(this.getManagerInfo(manager));
	}

	private String getBasicInfo(Employee employee) {
		String info = "Name: " + employee.getName() + "\t";
		info += "Sex: " + (employee.getSex() == Employee.MALE ? "Male" : "Female") + "\t";
		info += "Salary: " + employee.getSalary() + "\t";
		return info;
	}

	private String getManagerInfo(Manager manager) {
		String basicInfo = this.getBasicInfo(manager);
		String otherInfo = "Performance: " + manager.getPerformance() + "\t";
		return basicInfo + otherInfo;
	}

	private String getCommonEmployee(CommonEmployee commonEmployee) {
		String basicInfo = this.getBasicInfo(commonEmployee);
		String otherInfo = "Job: " + commonEmployee.getJob() + "\t";
		return basicInfo + otherInfo;
	}
}
