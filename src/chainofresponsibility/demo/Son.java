/**
 * 
 */
package chainofresponsibility.demo;

/**
 * @author Ang Li
 *
 */
public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	protected void response(IWomen women) {
		System.out.println("-- Mother is requesting to Son --");
		System.out.println(women.getRequest());
		System.out.println("Son's response is Agree\n");
	}

}
