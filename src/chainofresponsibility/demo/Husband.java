/**
 * 
 */
package chainofresponsibility.demo;

/**
 * @author Ang Li
 *
 */
public class Husband extends Handler{


	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	protected void response(IWomen women) {
		System.out.println("-- Wife is requesting to Husband --");
		System.out.println(women.getRequest());
		System.out.println("Husband's response is Agree\n");
	}

}
