/**
 * 
 */
package decorator.def;

/**
 * @author Ang Li
 *
 */
public abstract class Decorator extends Component{

	private Component component = null;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operate() {
		this.component.operate();
	}
}
