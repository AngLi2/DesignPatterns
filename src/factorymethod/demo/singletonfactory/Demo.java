/**
 * 
 */
package factorymethod.demo.singletonfactory;

/**
 * @author Ang Li
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton singleton = SingletonFactory.getSingleton();
		singleton.doSomething();
	}

}
