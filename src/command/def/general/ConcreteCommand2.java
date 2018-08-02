/**
 * 
 */
package command.def.general;

/**
 * @author Ang Li
 *
 */
public class ConcreteCommand2 extends Command {

	private Receiver receiver;
	
	public ConcreteCommand2() {
		super(new ConcreteReceiver1());
	}

	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
	}

	public void execute() {
		this.receiver.doSomething();
	}
}
