/**
 * 
 */
package memento.def.multistate;

import java.util.HashMap;

/**
 * @author Ang Li
 *
 */
public class Memento {

	private HashMap<String, Object> stateMap;

	/**
	 * @param stateMap
	 */
	public Memento(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}

	/**
	 * @return the stateMap
	 */
	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	/**
	 * @param stateMap the stateMap to set
	 */
	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
}
