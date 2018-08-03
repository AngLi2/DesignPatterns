/**
 * 
 */
package component.def.transparent;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void display(Component root) {
		for (Component component : root.getChildren()) {
			if (component instanceof Leaf) {
				component.doSomething();
			} else {
				display(component);
			}
		}
	}
}
