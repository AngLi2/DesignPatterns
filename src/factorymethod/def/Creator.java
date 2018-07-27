/**
 * 
 */
package factorymethod.def;

/**
 * @author Ang Li
 *
 */
public abstract class Creator {

	public abstract <T extends Product> T createProduct(Class<T> c);

}
