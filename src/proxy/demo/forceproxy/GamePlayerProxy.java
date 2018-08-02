/**
 * 
 */
package proxy.demo.forceproxy;

/**
 * @author Ang Li
 *
 */
public class GamePlayerProxy implements GamePlayer{

	private GamePlayer gamePlayer = null;
	
	public GamePlayerProxy(GamePlayer gamePlayer) {
		this.gamePlayer=gamePlayer;
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
	
	public GamePlayer getProxy() {
		return this;
	}
}
