/**
 * 
 */
package component.def.origin;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class Composite extends Component {

	private ArrayList<Component> componentArrayList = new ArrayList<>();

	public void add(Component component) {
		this.componentArrayList.add(component);
	}

	public void remove(Component component) {
		this.componentArrayList.remove(component);
	}

	public ArrayList<Component> getChildren() {
		return this.componentArrayList;
	}
}
