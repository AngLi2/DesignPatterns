/**
 * 
 */
package adapter.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ang Li
 *
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	public Map<String, String> getUserOfficeInfo() {
		HashMap<String, String> officeInfo = new HashMap<>();
		officeInfo.put("jobPosition", "The position is Boss");
		officeInfo.put("officeTelNumber", "The office number is ...");
		return officeInfo;
	}

}
