/**
 * 
 */
package facade.demo;

/**
 * @author Ang Li
 *
 */
public interface ILetterProcess {

	public void writeContext(String context);
	
	public void fillEnvelope(String address);
	
	public void letterInotoEnvelope();
	
	public void sendLetter();
}
