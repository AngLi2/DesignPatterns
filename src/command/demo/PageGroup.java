/**
 * 
 */
package command.demo;

/**
 * @author Ang Li
 *
 */
public class PageGroup extends Group{

	public void find() {
		System.out.println("Finding Page Group");
	}
	
	public void add() {
		System.out.println("User need to add a page");
	}
	
	public void change() {
		System.out.println("User need to change a page");
	}
	
	public void delete() {
		System.out.println("User need to delete a page");
	}
	
	public void plan() {
		System.out.println("User need to plan a page");
	}
}
