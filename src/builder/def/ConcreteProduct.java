/**
 * 
 */
package builder.def;

/**
 * @author Ang Li
 *
 */
public class ConcreteProduct extends Builder{

	private Product product = new Product();
	
	public void setPart() {
		//TODO
	}
	
	public Product buildProduct() {
		return product;
	}
}
