/**
 * 
 */
package builder.demo;

/**
 * @author Ang Li
 *
 */
public class BMWModel extends CarModel{

	protected void alarm() {
		System.out.println("BMW Car Alarm");
	}
	
	protected void engineBoom() {
		System.out.println("BMW Car Engine Boom");
	}
	
	protected void start() {
		System.out.println("BMW Car Start");
	}
	
	protected void stop() {
		System.out.println("BMW Car Stop");
	}
}
