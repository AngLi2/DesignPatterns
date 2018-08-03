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
public class OuterUserBaseInfo implements IOuterUserBaseInfo{

	public Map<String, String> getUserBaseInfo() {
		HashMap<String, String> baseInfoMap = new HashMap<String, String>();
		baseInfoMap.put("userName", "The member is ...");
		baseInfoMap.put("mobileNumber","The number of this member is ...");
		return baseInfoMap;
	}
}
