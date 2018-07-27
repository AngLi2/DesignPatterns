/**
 * 
 */
package abstractfactory.demo;

/**
 * @author Ang Li
 *
 */
public abstract class AbstractBlackHuman implements Human{

	public void getColor() {
		System.out.println("The color of black human is black");
	}
	
	public void talk() {
		System.out.println("Black human talk");
	}
}
