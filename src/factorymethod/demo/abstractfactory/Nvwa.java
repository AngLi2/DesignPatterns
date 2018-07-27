/**
 * 
 */
package factorymethod.demo.abstractfactory;


/**
 * @author Ang Li
 *
 */
public class Nvwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-- The first human generated is White Human --");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("-- The second human generated is Black Human --");
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("-- The third human generated is Yellow Human --");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
