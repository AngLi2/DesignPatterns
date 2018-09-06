/**
 * 
 */
package visitor.demo.multivisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		IShowVisitor showVisitor = new ShowVisitor();

		ITotalVisitor totalVisitor = new TotalVisitor();

		for (Employee employee : mockEmployee()) {

			employee.accept(showVisitor);
			employee.accept(totalVisitor);

		}

		showVisitor.report();
		totalVisitor.getTotalSalary();
	}

	public static List<Employee> mockEmployee() {

		List<Employee> employeeList = new ArrayList<>();

		CommonEmployee zhanngSan = new CommonEmployee();
		zhanngSan.setJob("Java Coder");
		zhanngSan.setName("ZhangSan");
		zhanngSan.setSalary(8000);
		zhanngSan.setSex(Employee.MALE);
		employeeList.add(zhanngSan);

		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("C Coder");
		liSi.setName("Lisi");
		liSi.setSalary(2000);
		liSi.setSex(Employee.FEMALE);
		employeeList.add(liSi);

		Manager wangWu = new Manager();
		wangWu.setName("WangWu");
		wangWu.setPerformance("Pretty Low");
		wangWu.setSalary(180000);
		wangWu.setSex(Employee.MALE);
		employeeList.add(wangWu);

		return employeeList;
	}
}
