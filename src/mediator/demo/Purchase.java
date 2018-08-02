/**
 * 
 */
package mediator.demo;

/**
 * @author Ang Li
 *
 */
public class Purchase extends AbstractColleague{
	
	public Purchase(AbstractMediator mediator) {
		super(mediator);
	}

	public void buyIBMcomputer(int number) {

		super.mediator.execute("purchase.buy", number);
	}
	
	public void refuseBuyIBM() {
		System.out.println("Refuse Buy IBM Computers");
	}
}
