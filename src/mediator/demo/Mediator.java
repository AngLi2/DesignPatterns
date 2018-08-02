/**
 * 
 */
package mediator.demo;

/**
 * @author Ang Li
 *
 */
public class Mediator extends AbstractMediator{

	public void execute(String str,Object...objects) {
		if(str.equals("purchase.buy")) {
			this.buyComputer((Integer)objects[0]);
		}else if(str.equals("sale.sell")) {
			this.sellComputer((Integer)objects[0]);
		}else if(str.equals("sale.offsell")) {
			this.offSale();
		}else if(str.equals("sale.sell")) {
			this.clearStock();
		}
	}
	
	private void buyComputer(int number) {
		int saleStatus = super.sale.getSaleStatus();
		if(saleStatus>80) {
			System.out.println("Buy IBM Computer " + number);
			stock.increase(number);
		}else {
			int buyNumber = number / 2;
			System.out.println("Buy IBM Computer" + buyNumber);
		}
	}
	
	private void sellComputer(int number) {
		if(super.stock.getStockNumber()<number) {
			super.purchase.buyIBMcomputer(number);
		}
		super.stock.decrease(number);
	}
	
	private void offSale() {
		System.out.println("Off Sale Computer "+stock.getStockNumber());
	}
	
	private void clearStock() {
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}
}
