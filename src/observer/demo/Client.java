/**
 * 
 */
package observer.demo;

import java.util.Observer;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		Observer lisi = new Lisi();
		Observer wangsi = new Wangsi();
		
		Hanfeizi hanfeizi = new Hanfeizi();
		
		hanfeizi.addObserver(lisi);
		hanfeizi.addObserver(wangsi);
		
		hanfeizi.haveBreakfast();
	}
}
