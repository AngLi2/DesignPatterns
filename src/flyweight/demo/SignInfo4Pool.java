/**
 * 
 */
package flyweight.demo;

/**
 * @author Ang Li
 *
 */
public class SignInfo4Pool extends SignInfo{

	private ExtrinsicState key;
	
	public SignInfo4Pool(ExtrinsicState key) {
		this.key = key;
	}

	/**
	 * @return the key
	 */
	public ExtrinsicState getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(ExtrinsicState key) {
		this.key = key;
	}
	
	
}
