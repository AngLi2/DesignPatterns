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
public class OuterUserHomeInfo implements IOuterUserHomeInfo{

	public Map<String, String> getUserHomeInfo(){
		
		HashMap<String, String> homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumber", "The home tel number is ...");
		homeInfo.put("homeAddress", "The home address is ...");
		return homeInfo;
	}
}
