/**
 * 
 */
package builder.def;

/**
 * @author Ang Li
 *
 */
public class Director {

	private Builder builder = new ConcreteProduct();
	
	public Product getProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
