/**
 * 
 */
package builder.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class BenzBuilder extends CarBuilder{

	private BenzModel benzModel = new BenzModel();
	
	public CarModel getCarModel() {
		return this.benzModel;
	}
	
	public void setSequence(ArrayList<String> sequence) {
		this.benzModel.setSequence(sequence);
	}
}
