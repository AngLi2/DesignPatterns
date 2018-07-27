/**
 * 
 */
package factorymethod.demo.abstractfactory;

/**
 * @author Ang Li
 *
 */
public class WhiteHuman implements Human{

	public void getColor() {
		System.out.println("The color of white human is white");
	}

	public void talk() {
		System.out.println("White human talk");
	}
}
