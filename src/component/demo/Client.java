/**
 * 
 */
package component.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static String getTreeInfo(Branch root) {

		ArrayList<Corp> subordinateList = root.getSubordinateList();

		String info = "";

		for (Corp corp : subordinateList) {
			if (corp instanceof Leaf) {
				info += corp.getInfo() + "\n";
			} else {
				info += corp.getInfo() + "\n" + getTreeInfo((Branch) corp);
			}
		}
		return info;
	}

}
