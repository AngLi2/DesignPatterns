/**
 * 
 */
package abstractfactory.demo;

/**
 * @author Ang Li
 *
 */
public abstract class AbstractYellowHuman implements Human{

	public void getColor() {
		System.out.println("The color of yellow human is yellow");
	}
	
	public void talk() {
		System.out.println("Black human talk");
	}
}
