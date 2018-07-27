/**
 * 
 */
package factorymethod.demo.simplefactory;

/**
 * @author Ang Li
 *
 */
public class HumanFactory {
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Human Generating Error");
		}
		return (T)human;
	}
}
