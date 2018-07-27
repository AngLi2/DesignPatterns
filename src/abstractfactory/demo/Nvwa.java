/**
 * 
 */
package abstractfactory.demo;

/**
 * @author Ang Li
 *
 */
public class Nvwa {

	public static void main(String[] args) {
		HumanFactory maleHumanFactory = new MaleFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		System.out.println("-- Create a new male yellow human --");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		System.out.println("-- Create a new female yellow human --");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
	}

}
