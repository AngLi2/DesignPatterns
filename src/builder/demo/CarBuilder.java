/**
 * 
 */
package builder.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public abstract class CarBuilder {

	public abstract void setSequence(ArrayList<String> sequence);
	
	public abstract CarModel getCarModel();
}
