/**
 * 
 */
package component.def.traverse;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class Branch extends Corp {

	ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void addSubordinate(Corp corp) {
		corp.setParent(this);
		this.subordinateList.add(corp);
	}

	public ArrayList<Corp> getSubordinate() {
		return this.subordinateList;
	}
}
