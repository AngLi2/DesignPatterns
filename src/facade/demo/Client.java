/**
 * 
 */
package facade.demo;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
		
		String address = "9 Arlington St. Apt. 1";
		
		String context = "This is Ang Li, I have 0 offer";
		
		hellRoadPostOffice.sendLetter(context, address);
	}
}
