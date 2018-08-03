/**
 * 
 */
package chainofresponsibility.demo;

/**
 * @author Ang Li
 *
 */
public class Women implements IWomen {

	private int type = 0;

	private String request = "";

	public Women(int type, String request) {
		this.type = type;
		switch (this.type) {
		case 1:
			this.request = "Daughter's request is " + request;
			break;
		case 2:
			this.request = "Wife's request is " + request;
		case 3:
			this.request = "Mother's request is " + request;
		}
	}

	public int getType() {
		return this.type;
	}

	public String getRequest() {
		return this.request;
	}
}
