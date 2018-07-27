/**
 * 
 */
package singleton.demo;

/**
 * @author Ang Li
 *
 */
public class Minister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mininsterNum = 5;
		for (int i = 0; i < mininsterNum; i++) {
			Emperor emperor = Emperor.getInstance();
			System.out.print("No " + i + " Munister visit: ");
			emperor.say();
		}
	}

}
