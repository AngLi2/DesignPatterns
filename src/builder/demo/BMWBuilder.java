/**
 * 
 */
package builder.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class BMWBuilder extends CarBuilder{

	private BMWModel bmwModel = new BMWModel();
	
	public CarModel getCarModel() {
		return this.bmwModel;
	}
	
	public void setSequence(ArrayList<String> sequence) {
		this.bmwModel.setSequence(sequence);
	}
}
