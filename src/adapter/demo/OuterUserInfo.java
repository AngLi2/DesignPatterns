/**
 * 
 */
package adapter.demo;

import java.util.Map;

/**
 * @author Ang Li
 *
 */
public class OuterUserInfo implements IUserInfo {

	private IOuterUserBaseInfo baseInfo = null;
	private IOuterUserHomeInfo homeInfo = null;
	private IOuterUserOfficeInfo officeInfo = null;

	private Map<String, String> baseMap = null;
	private Map<String, String> homeMap = null;
	private Map<String, String> officeMap = null;

	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;

		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}

	public String getHomeAddress() {
		String homeAddress = (String) this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	public String getHomeTelNumber() {
		String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

	public String getJobPosition() {
		String jobPosition = (String) this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	public String getMobileNumber() {
		String mobileNumber = (String) this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	public String getOfficeTelNumber() {
		String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}

	public String getUserName() {
		String userName = (String) this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}
}
