/**
 * 
 */
package visitor.def.origin;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			Element element = ObjectStructure.createElement();

			element.accept(new Visitor());
		}

	}

}
