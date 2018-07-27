/**
 * 
 */
package factorymethod.demo.simplefactory;


/**
 * @author Ang Li
 *
 */
public class Nvwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-- The first human generated is White Human --");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("-- The second human generated is Black Human --");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("-- The third human generated is Yellow Human --");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
