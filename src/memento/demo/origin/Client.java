/**
 * 
 */
package memento.demo.origin;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Boy boy = new Boy();
		
		Caretaker caretaker = new Caretaker();
		
		boy.setState("Good Mood");
		
		System.out.println("--- The boy's 1st mood is ---");
		
		System.out.println(boy.getState());
		
		caretaker.setMemento(boy.createMemento());
		
		System.out.println("--- The boy's 2nd mood is ---");
		
		System.out.println(boy.getState());
		
		boy.restoreMemento(caretaker.getMemento());
		
		System.out.println("--- The boy's 3rd mood is ---");
		
		System.out.println(boy.getState());
		
	}
	
}
