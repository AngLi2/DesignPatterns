/**
 * 
 */
package mediator.def;

/**
 * @author Ang Li
 *
 */
public abstract class Mediator {
	
	protected ConcreteColleague1 colleague1;

	protected ConcreteColleague2 colleague2;
	
	/**
	 * @return the conlleague1
	 */
	public ConcreteColleague1 getConlleague1() {
		return colleague1;
	}

	/**
	 * @param conlleague1 the conlleague1 to set
	 */
	public void setConlleague1(ConcreteColleague1 conlleague1) {
		this.colleague1 = conlleague1;
	}

	/**
	 * @return the conlleague2
	 */
	public ConcreteColleague2 getConlleague2() {
		return colleague2;
	}

	/**
	 * @param conlleague2 the conlleague2 to set
	 */
	public void setConlleague2(ConcreteColleague2 conlleague2) {
		this.colleague2 = conlleague2;
	}
	
	public abstract void doSomething1();
	
	public abstract void doSomething2();
}
