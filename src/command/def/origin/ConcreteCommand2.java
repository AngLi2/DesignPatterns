/**
 * 
 */
package command.def.origin;

/**
 * @author Ang Li
 *
 */
public class ConcreteCommand2 extends Command {

	private Receiver receiver;

	public ConcreteCommand2(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		this.receiver.doSomething();
	}
}
