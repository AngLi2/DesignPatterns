/**
 * 
 */
package chainofresponsibility.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		ArrayList<IWomen> arrayList = new ArrayList<>();
		
		for(int i = 0;i<5;i++) {
			arrayList.add(new Women(random.nextInt(4), "I need to go out"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		
		for(IWomen women : arrayList) {
			father.HandleMessage(women);
		}
	}

}
