/**
 * 
 */
package builder.demo;

/**
 * @author Ang Li
 *
 */
public class BenzModel extends CarModel{

	protected void alarm() {
		System.out.println("Benz Car Alarm");
	}
	
	protected void engineBoom() {
		System.out.println("Benz Car Engine Boom");
	}
	
	protected void start() {
		System.out.println("Benz Car Start");
	}
	
	protected void stop() {
		System.out.println("Benz Car Stop");
	}
}
