/**
 * 
 */
package memento.def.clone;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		Originator originator = new Originator();

		originator.setState("First State");

		System.out.println("First State is: " + originator.getState());

		originator.createMemento();

		originator.setState("State After Editting");

		System.out.println("After Editting: " + originator.getState());

		originator.restoreMemento();

		System.out.println("After Restore: " + originator.getState());

	}

}
