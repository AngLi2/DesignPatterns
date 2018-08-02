/**
 * 
 */
package command.demo;

/**
 * @author Ang Li
 *
 */
public class RequirementGroup extends Group{

	public void find() {
		System.out.println("Finding Requirement Group");
	}
	
	public void add() {
		System.out.println("User need to add a requirement");
	}
	
	public void change() {
		System.out.println("User need to change a requirement");
	}
	
	public void delete() {
		System.out.println("User need to delete a requirement");
	}
	
	public void plan() {
		System.out.println("User need to plan a requirement");
	}
}
