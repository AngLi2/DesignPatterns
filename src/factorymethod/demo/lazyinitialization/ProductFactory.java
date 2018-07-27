/**
 * 
 */
package factorymethod.demo.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

import factorymethod.def.ConcreteProduct1;
import factorymethod.def.ConcreteProduct2;
import factorymethod.def.Product;

/**
 * @author Ang Li
 *
 */
public class ProductFactory {

	private static final Map<String,Product> PR_MAP = new HashMap<>();
	
	public static synchronized Product createProduct(String type) throws Exception{
		
		Product product = null;
		
		if(PR_MAP.containsKey(type)) {
			product = PR_MAP.get(type);
		}else {
			if(type.equals("Product1")) {
				product = new ConcreteProduct1();
			}else {
				product = new ConcreteProduct2();
			}
			PR_MAP.put(type, product);
		}
		
		return product;
	}
}
