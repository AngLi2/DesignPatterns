/**
 * 
 */
package bridge.demo;

/**
 * @author Ang Li
 *
 */
public abstract class Corp {

	private Product product;

	public Corp(Product product) {
		this.product = product;
	}

	public void makeMoney() {
		this.product.beProducted();
		this.product.beSelled();
	}
}
