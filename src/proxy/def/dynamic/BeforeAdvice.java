/**
 * 
 */
package proxy.def.dynamic;

/**
 * @author Ang Li
 *
 */
public class BeforeAdvice implements Advice{

	public void exec() {
		System.out.println("Before Advice is executing");
	}
}
