/**
 * 
 */
package proxy.demo.forceproxy;


/**
 * @author Ang Li
 *
 */
public class GamePlayerImpl implements GamePlayer{

	private String name = "";
	
	private GamePlayer proxy = null;
	
	public GamePlayerImpl(String name) {
		this.name = name;
	}
	
	public GamePlayer getProxy() {
		this.proxy = new GamePlayerProxy(this);
		return this.proxy;
	}
	
	public void killBoss() {
		if(this.isProxy()) {
			System.out.println(this.name+" is Killing Boss");
		}else {
			System.out.println("Please access by proxy");
		}
	}
	
	public void login(String user, String password) {
		if(this.isProxy()) {
			System.out.println("User " + user + " Log in");
		}else {
			System.out.println("Please access by proxy");
		}
	}
	
	public void upgrade() {
		if(this.isProxy()) {
			System.out.println(this.name + " is Upgrading");
		}else {
			System.out.println("Please access by proxy");
		}
	}
	
	private boolean isProxy() {
		if(this.proxy == null) {
			return false;
		}else {
			return true;
		}
	}
}
