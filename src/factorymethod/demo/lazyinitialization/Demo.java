/**
 * 
 */
package factorymethod.demo.lazyinitialization;

import factorymethod.def.Product;

/**
 * @author Ang Li
 *
 */
public class Demo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = ProductFactory.createProduct("Product1");
		Product product2_1 = ProductFactory.createProduct("Product2");
		Product product2_2 = ProductFactory.createProduct("Product2");
		
		product1.method2();
		product2_1.method2();
		product2_2.method2();
	}

}
