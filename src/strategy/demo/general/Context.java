/**
 * 
 */
package strategy.demo.general;

/**
 * @author Ang Li
 *
 */
public class Context {

	private Calculator calculator = null;

	public Context(Calculator calculator) {
		this.calculator = calculator;
	}

	public int exec(int a, int b) {
		return this.calculator.exec(a, b);
	}
}
