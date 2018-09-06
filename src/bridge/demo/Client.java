/**
 * 
 */
package bridge.demo;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		House house =new House();
		
		System.out.println("--- House Corp ---");
		
		HouseCorp houseCorp = new HouseCorp(house);
		
		houseCorp.makeMoney();
		
		System.out.println("\n");
		
		System.out.println("--- Shanzhai Corp ---");
		
		ShanzhaiCorp shanzhaiCorp  = new ShanzhaiCorp(new IPod());
		
		shanzhaiCorp.makeMoney();
	}
}
