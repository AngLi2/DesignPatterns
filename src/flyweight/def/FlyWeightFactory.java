/**
 * 
 */
package flyweight.def;

import java.util.HashMap;

/**
 * @author Ang Li
 *
 */
public class FlyWeightFactory {

	private static HashMap<String, FlyWeight> pool = new HashMap<>();
	
	public static FlyWeight getFlyWeight(String extrinsic) {
		
		FlyWeight flyWeight = null;
		
		if(pool.containsKey(extrinsic)) {
			flyWeight = pool.get(extrinsic);
		}else {
			flyWeight = new ConcreteFlyWeight1(extrinsic);
			pool.put(extrinsic, flyWeight);
		}
		return flyWeight;
	}
}
