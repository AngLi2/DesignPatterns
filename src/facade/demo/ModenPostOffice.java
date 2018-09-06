/**
 * 
 */
package facade.demo;

/**
 * @author Ang Li
 *
 */
public class ModenPostOffice {

	private ILetterProcess letterProcess = new LetterProcessImpl();
	private Police letterPolice = new Police();

	public void sendLetter(String context, String address) {
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);
		letterPolice.checkLetter(letterProcess);
		letterProcess.letterInotoEnvelope();
		letterProcess.sendLetter();
	}
}
