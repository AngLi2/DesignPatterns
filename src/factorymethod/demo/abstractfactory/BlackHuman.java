/**
 * 
 */
package factorymethod.demo.abstractfactory;

/**
 * @author Ang Li
 *
 */
public class BlackHuman implements Human {

	public void getColor() {
		System.out.println("The color of black human is black");

	}

	public void talk() {
		System.out.println("Black human talk");
	}

}
