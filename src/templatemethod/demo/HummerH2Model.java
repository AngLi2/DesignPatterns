/**
 * 
 */
package templatemethod.demo;

/**
 * @author Ang Li
 *
 */
public class HummerH2Model extends HummerModel{
	
	protected void alarm() {
		System.out.println("Hummer 2 Alarm...");
	}
	
	protected void engineBoom() {
		System.out.println("Hummer 2 Engine Boom");
	}
	
	protected void start() {
		System.out.println("Hummer 2 Start");
	}
	
	protected void stop() {
		System.out.println("Hummer 2 Stop");
	}
	
	protected boolean isAlarm() {
		return false;
	}
	
}
