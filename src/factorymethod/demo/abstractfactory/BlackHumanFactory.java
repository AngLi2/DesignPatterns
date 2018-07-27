/**
 * 
 */
package factorymethod.demo.abstractfactory;

/**
 * @author Ang Li
 *
 */
public class BlackHumanFactory extends AbstractHumanFactory{

	public Human createHuman() {
		return new BlackHuman();
	}
}
