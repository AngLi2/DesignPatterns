/**
 * 
 */
package flyweight.demo;

/**
 * @author Ang Li
 *
 */
public class ExtrinsicState {

	private String subject;
	private String location;

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public boolean equals(Object object) {
		if (object instanceof ExtrinsicState) {
			ExtrinsicState state = (ExtrinsicState) object;
			return state.getLocation().equals(location) && state.getSubject().equals(subject);
		}
		return false;
	}

	public int hashCode() {
		return subject.hashCode() + location.hashCode();
	}
}
