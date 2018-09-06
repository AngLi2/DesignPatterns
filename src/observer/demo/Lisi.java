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
public class Lisi implements Observer {

	public void update(Observable observable, Object obj) {
		System.out.println("Lisi: Hanfeizi is doing something, report to Boss");
		this.reportToQinShiHuang(obj.toString());
		System.out.println("Lisi: Reporting completed");
	}

	private void reportToQinShiHuang(String reportContext) {
		System.out.println("Lisi: Attention, Hanfeizi is doing something --> " + reportContext);
	}

}
