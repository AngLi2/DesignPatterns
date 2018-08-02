/**
 * 
 */
package proxy.demo.uniqueproxy;

import proxy.demo.generalproxy.GamePlayer;
import proxy.demo.generalproxy.GamePlayerImpl;

/**
 * @author Ang Li
 *
 */
public class GamePlayerProxy implements GamePlayer,Proxy{
	
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
		this.count();
	}
	
	public void count() {
		System.out.println("The count of upgrade is 150 dollar");
	}

}
