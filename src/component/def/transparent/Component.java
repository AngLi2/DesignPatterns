/**
 * 
 */
package component.def.transparent;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public abstract class Component {

	public void doSomething() {
		
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract ArrayList<Component> getChildren();
}
