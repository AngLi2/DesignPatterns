/**
 * 
 */
package command.def.general;

/**
 * @author Ang Li
 *
 */
public class ConcreteCommand1 extends Command{

	private Receiver receiver;
	
	public ConcreteCommand1() {
		super(new ConcreteReceiver1());
	}
	
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
	}
	
	public void execute() {
		this.receiver.doSomething();
	}
}
