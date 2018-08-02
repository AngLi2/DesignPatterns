/**
 * 
 */
package command.demo;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		System.out.println("-- User need to delete a page --");
		
		Command command = new DeletePageCommand();
		
		invoker.setCommand(command);
		
		invoker.action();
	}

}
