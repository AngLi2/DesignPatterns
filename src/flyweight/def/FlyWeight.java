/**
 * 
 */
package flyweight.def;

/**
 * @author Ang Li
 *
 */
public abstract class FlyWeight {

	private String intrinsic;
	
	protected final String extrinsic;
	
	public FlyWeight(String extrinsic) {
		this.extrinsic = extrinsic;
	}
	
	public abstract void operate();

	/**
	 * @return the intrinsic
	 */
	public String getIntrinsic() {
		return intrinsic;
	}

	/**
	 * @param intrinsic the intrinsic to set
	 */
	public void setIntrinsic(String intrinsic) {
		this.intrinsic = intrinsic;
	}	
}
