/**
 * 
 */
package adapter.def;

/**
 * @author Ang Li
 *
 */
public class Client {
	
	public static void main(String[] args) {
		
		Target target = new ConcreteTarget();
		
		target.request();
		
		Target target2 = new Adapter();
		
		target2.request();
	}
}
