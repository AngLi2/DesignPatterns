/**
 * 
 */
package factorymethod.demo.abstractfactory;

/**
 * @author Ang Li
 *
 */
public class WhiteHumanFactory extends AbstractHumanFactory{

	public Human createHuman() {
		return new WhiteHuman();
	}
	
}
