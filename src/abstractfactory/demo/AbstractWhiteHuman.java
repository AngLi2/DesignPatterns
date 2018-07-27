/**
 * 
 */
package abstractfactory.demo;

/**
 * @author Ang Li
 *
 */
public abstract class AbstractWhiteHuman implements Human{

	public void getColor() {
		System.out.println("The color of white human is white");
	}
	
	public void talk() {
		System.out.println("White human talk");
	}
}
