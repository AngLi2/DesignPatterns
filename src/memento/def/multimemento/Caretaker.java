/**
 * 
 */
package memento.def.multimemento;

import java.util.HashMap;

import memento.def.origin.Memento;

/**
 * @author Ang Li
 *
 */
public class Caretaker {

	private HashMap<String, Memento> mementoMap = new HashMap<>();

	/**
	 * @return the mementoMap
	 */
	public Memento getMemento(String index) {
		return mementoMap.get(index);
	}

	/**
	 * @param mementoMap
	 *            the mementoMap to set
	 */
	public void setMementoMap(String index, Memento memento) {
		this.mementoMap.put(index, memento);
	}

}
