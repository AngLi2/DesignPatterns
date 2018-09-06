/**
 * 
 */
package memento.def.multimemento;

import memento.def.origin.Originator;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		Originator originator = new Originator();

		Caretaker caretaker = new Caretaker();

		caretaker.setMementoMap("001", originator.createMemento());

		caretaker.setMementoMap("002", originator.createMemento());

		originator.restoreMemento(caretaker.getMemento("001"));

	}

}
