/**
 * 
 */
package memento.def.multistate;


/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Originator originator = new Originator();
		
		Caretaker caretaker = new Caretaker();
		
		originator.setState1("China");
		
		originator.setState2("America");
		
		originator.setState3("Japan");
		
		System.out.println("-- Original States --\n"+originator);
		
		caretaker.setMemento(originator.createMemento());
		
		originator.setState1("Coder");
		
		originator.setState2("Study");
		
		originator.setState3("Leetcode");
		
		System.out.println("-- After Editting --\n"+originator);
		
		originator.restoreMemento(caretaker.getMemento());
		
		System.out.println("-- After Restore --\n"+originator);
		
	}
	
}
