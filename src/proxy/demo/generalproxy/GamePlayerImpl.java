/**
 * 
 */
package proxy.demo.generalproxy;

/**
 * @author Ang Li
 *
 */
public class GamePlayerImpl implements GamePlayer {

	private String name = "";

	public GamePlayerImpl(GamePlayer gamePlayer, String name) throws Exception{
		if(gamePlayer == null) {
			throw new Exception("Can not create real player");
		} else {
			this.name = name;
		}
	}

	public void killBoss() {
		System.out.println(this.name + " is Killing Boss");
	}

	public void login(String user, String password) {
		System.out.println("User " + user + " Log in");
	}

	public void upgrade() {
		System.out.println(this.name + " is Upgrading");
	}
}
