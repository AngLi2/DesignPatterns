/**
 * 
 */
package mediator.demo;

/**
 * @author Ang Li
 *
 */
public class Stock extends AbstractColleague{
	
	public Stock(AbstractMediator mediator) {
		super(mediator);
	}

	private static int COMPUTER_NUMBER = 100;
	
	public void increase(int number) {
		COMPUTER_NUMBER+= number;
		System.out.println("The Computer Number is"+COMPUTER_NUMBER);
	}
	
	public void decrease(int number) {
		COMPUTER_NUMBER -=number;
		System.out.println("The Computer Number is"+COMPUTER_NUMBER);
	}
	
	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	public void clearStock() {
		System.out.println("Clear Number is"+COMPUTER_NUMBER);
		super.mediator.execute("stock.clear");
	}
}
