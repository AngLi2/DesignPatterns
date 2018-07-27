/**
 * 
 */
package factorymethod.demo.abstractfactory;

/**
 * @author Ang Li
 *
 */
public class YellowHumanFactory extends AbstractHumanFactory{

	public Human createHuman() {
		return new YellowHuman();
	}
	
}
