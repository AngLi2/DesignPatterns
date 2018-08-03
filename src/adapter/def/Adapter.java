/**
 * 
 */
package adapter.def;

/**
 * @author Ang Li
 *
 */
public class Adapter extends Adaptee implements Target {

	public void request() {
		super.doSomething();
	}
}
