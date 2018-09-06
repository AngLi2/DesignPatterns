/**
 * 
 */
package bridge.demo;

/**
 * @author Ang Li
 *
 */
public class HouseCorp extends Corp {

	public HouseCorp(House house) {
		super(house);
	}

	public void makeMoney() {
		super.makeMoney();
		System.out.println("House Corp Make Money");
	}
}
