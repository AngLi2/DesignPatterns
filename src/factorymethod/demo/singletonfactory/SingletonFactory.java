/**
 * 
 */
package factorymethod.demo.singletonfactory;

import java.lang.reflect.Constructor;

/**
 * @author Ang Li
 *
 */
public class SingletonFactory {

	private static Singleton singleton;
	
	static {
		try {
			Class c1 = Class.forName(Singleton.class.getName());
			Constructor constructor = c1.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton = (Singleton)constructor.newInstance();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}

class Singleton {

	private Singleton() {
		
	}
	
	public void doSomething() {
		System.out.println("Singleton Factory");
	}
}
