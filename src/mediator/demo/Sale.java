/**
 * 
 */
package mediator.demo;

import java.util.Random;

/**
 * @author Ang Li
 *
 */
public class Sale extends AbstractColleague{
	
	public Sale(AbstractMediator mediator) {
		super(mediator);
	}

	public void sellIBMComputer(int number) {
		super.mediator.execute("sale.sell", number);
		System.out.println("Sale IBM Computer " + number);
	}

	public int getSaleStatus() {
		Random random = new Random(System.currentTimeMillis());
		int saleStatus = random.nextInt(100);
		System.out.println("The Status of IBM Sale is " + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		super.mediator.execute("sale.offsell");
	}
}
