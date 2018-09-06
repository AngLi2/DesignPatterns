/**
 * 
 */
package bridge.demo;

/**
 * @author Ang Li
 *
 */
public class ShanzhaiCorp extends Corp {

	public ShanzhaiCorp(Product product) {
		super(product);
	}

	public void makeMoney() {
		super.makeMoney();
		System.out.println("Shanzhai Corp Make Money");
	}
}
