/**
 * 
 */
package visitor.def.origin;

import java.util.Random;

/**
 * @author Ang Li
 *
 */
public class ObjectStructure {

	public static Element createElement() {

		Random random = new Random();

		if (random.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
