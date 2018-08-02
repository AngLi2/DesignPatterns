/**
 * 
 */
package prototype.def;

/**
 * @author Ang Li
 */
public class PrototypeClass implements Cloneable {

	/**
	 * 1. Constructor will not be executed in the Prototype Pattern; 
	 * 2. Final members can not be cloned
	 * 3. Objects need to be recalled in clone() to guarantee deep clone
	 */

	public PrototypeClass clone() {

		PrototypeClass prototypeClass = null;

		try {
			prototypeClass = (PrototypeClass) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}

		return prototypeClass;
	}
}
