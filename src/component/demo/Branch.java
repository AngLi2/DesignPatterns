/**
 * 
 */
package component.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class Branch extends Corp {

	private ArrayList<Corp> subordinateList = new ArrayList<Corp>();

	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}

	public void addSubordinateList(Corp corp) {
		subordinateList.add(corp);
	}

	public ArrayList<Corp> getSubordinateList() {
		return this.subordinateList;
	}
}
