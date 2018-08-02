/**
 * 
 */
package proxy.demo.generalproxy;

/**
 * @author Ang Li
 *
 */
public class GamePlayerProxy implements GamePlayer{
	
	private GamePlayer gamePlayer = null;

	public GamePlayerProxy(String name) {
		try {
			gamePlayer = new GamePlayerImpl(this, name);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	public void login(String user, String password) {
		this.gamePlayer.login(user, password);
	}

	public void upgrade() {
		this.gamePlayer.upgrade();
	}
}
