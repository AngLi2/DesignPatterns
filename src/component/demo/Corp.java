/**
 * 
 */
package component.demo;

/**
 * @author Ang Li
 *
 */
public abstract class Corp {

	private String name = "";
	private String position = "";

	private int salary = 0;

	public Corp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getInfo() {
		String info = "";
		info = "Name: " + this.name;
		info += "\t Position: " + this.position;
		info += "\t Salary: " + this.salary;
		return info;
	}
}
