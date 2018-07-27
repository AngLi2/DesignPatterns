/**
 * 
 */
package singleton.def;

/**
 * @author Ang Li Ensure a class has only one instance, and provide a global
 *         point of access to it.
 */
public class Singleton {

	private static final Singleton SINGLETON = new Singleton();

	// Ensure only one instance
	private Singleton() {

	}

	// Get the singleton instance
	public static Singleton getSingleton() {
		return SINGLETON;
	}

	// Other methods, prefer static methods
	public static void doSomething() {

	}
}
