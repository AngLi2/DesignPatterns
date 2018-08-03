/**
 * 
 */
package chainofresponsibility.demo;

/**
 * @author Ang Li
 *
 */
public class Father extends Handler {

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	protected void response(IWomen women) {
		System.out.println("-- Daughter is requesting to Father --");
		System.out.println(women.getRequest());
		System.out.println("Father's response is Agree\n");
	}
}
