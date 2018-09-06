/**
 * 
 */
package facade.demo;

/**
 * @author Ang Li
 *
 */
public class LetterProcessImpl implements ILetterProcess{

	public void writeContext(String context) {
		System.out.println("The context of letter is: "+context);
	}
	
	public void fillEnvelope(String address) {
		System.out.println("The address of letter is: "+address);
	}
	
	public void letterInotoEnvelope() {
		System.out.println("Put the letter to envolope");
	}
	
	public void sendLetter() {
		System.out.println("Send Letter");
	}
}
