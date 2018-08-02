/**
 * 
 */
package proxy.demo.forceproxy;


/**
 * @author Ang Li
 *
 */
public class Client {
	
	//Can be rebuilt by template method pattern
	public static void main(String[] args) {
		
		System.out.println("-- Access the user directly --");
		
		GamePlayer gamePlayer = new GamePlayerImpl("ZhangSan");
		
		System.out.println("Start Time is 2018/7/27");
		
		gamePlayer.login("zhangsan121", "password");
	
		gamePlayer.killBoss();
		
		gamePlayer.upgrade();
		
		System.out.println("End");
		
		System.out.println("-- Access the user by proxy --");
		
		GamePlayer proxy = new GamePlayerProxy(gamePlayer);
		
		System.out.println("Start Time is 2018/7/27");
		
		proxy.login("zhangsan121", "password");
	
		proxy.killBoss();
		
		proxy.upgrade();
		
		System.out.println("End");
		
		System.out.println("-- Access the user by force proxy --");
		
		GamePlayer forceProxy = gamePlayer.getProxy();
		
		System.out.println("Start Time is 2018/7/27");
		
		forceProxy.login("zhangsan121", "password");
	
		forceProxy.killBoss();
		
		forceProxy.upgrade();
		
		System.out.println("End");
		
	}

}
