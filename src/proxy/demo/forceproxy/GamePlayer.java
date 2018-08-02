/**
 * 
 */
package proxy.demo.forceproxy;

/**
 * @author Ang Li
 *
 */
public interface GamePlayer {

	public void login(String user, String password);
	
	public void killBoss();
	
	public void upgrade();
	
	public GamePlayer getProxy();
}
