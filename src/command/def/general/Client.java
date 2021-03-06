/**
 * 
 */
package command.def.general;

/**
 * @author Ang Li
 *
 */
public class Client {

	// Receiver can be hidden in constructor of Command

	public static void main(String[] args) {

		Invoker invoker = new Invoker();

		Receiver receiver = new ConcreteReceiver1();

		Command command = new ConcreteCommand1(receiver);

		invoker.setCommand(command);

		invoker.action();
	}
}
