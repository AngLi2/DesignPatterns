/**
 * 
 */
package templatemethod.demo;

/**
 * @author Ang Li
 *
 */
public class HummerH1Model extends HummerModel{

	private boolean alarmFlag = true;
	
	protected void alarm() {
		System.out.println("Hummer 1 Alarm...");
	}
	
	protected void engineBoom() {
		System.out.println("Hummer 1 Engine Boom");
	}
	
	protected void start() {
		System.out.println("Hummer 1 Start");
	}
	
	protected void stop() {
		System.out.println("Hummer 1 Stop");
	}
	
	protected boolean isAlarm() {
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}
}
