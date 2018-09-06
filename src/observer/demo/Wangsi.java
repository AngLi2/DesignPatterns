/**
 * 
 */
package observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Ang Li
 *
 */
public class Wangsi implements Observer{

	public void update(Observable observable, Object obj) {
		System.out.println("Wangsi: Hanfeizi is doing something, report to Boss");
		this.reportToQinShiHuang(obj.toString());
		System.out.println("Wangsi: Reporting completed");
	}

	private void reportToQinShiHuang(String reportContext) {
		System.out.println("Wangsi: Attention, Hanfeizi is doing something --> " + reportContext);
	}
}
