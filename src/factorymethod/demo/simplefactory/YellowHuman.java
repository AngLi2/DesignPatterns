/**
 * 
 */
package factorymethod.demo.simplefactory;

/**
 * @author Ang Li
 *
 */
public class YellowHuman implements Human{

	public void getColor() {
		System.out.println("The color of yellow human is yellow");
	}

	public void talk() {
		System.out.println("Yellow human talk");
	}
}
