/**
 * 
 */
package flyweight.demo;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			String subject = "Subject: " + i;
			for (int j = 0; j < 30; j++) {
				String location = "Location: " + j;
				ExtrinsicState extrinsicState = new ExtrinsicState();
				extrinsicState.setLocation(location);
				extrinsicState.setSubject(subject);
				SignInfoFactory.getSignInfo(extrinsicState);
			}
		}
		ExtrinsicState extrinsicState = new ExtrinsicState();
		extrinsicState.setLocation("Location: 1");
		extrinsicState.setSubject("Subject: 1");
		SignInfo signInfo = SignInfoFactory.getSignInfo(extrinsicState);
	}
}
