/**
 * 
 */
package flyweight.demo;

import java.util.HashMap;
/**
 * @author Ang Li
 *
 */
public class SignInfoFactory {
	
	private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<>();
	
	public static SignInfo signInfo() {
		return new SignInfo();
	}

	public static SignInfo getSignInfo(ExtrinsicState extrinsicState) {
		
		SignInfo result = null;
		
		if(!pool.containsKey(extrinsicState)) {
			System.out.println(extrinsicState.getLocation()+"-"+extrinsicState.getSubject()+" --- New an objcet and put it to pool");
			result = new SignInfo4Pool(extrinsicState);
			pool.put(extrinsicState, result);
		}else {
			result = pool.get(extrinsicState);
			System.out.println(extrinsicState.getLocation()+"-"+extrinsicState.getSubject()+" --- Get from pool directly");
		}
		
		return result;
	}
}
