/**
 * 
 */
package proxy.demo.uniqueproxy;

import proxy.demo.generalproxy.GamePlayer;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		GamePlayer proxy = new GamePlayerProxy("ZhangSan");
		
		System.out.println("Start Time is 2018/7/27");
		
		proxy.login("zhangsan121", "password");

		proxy.killBoss();
		
		proxy.upgrade();
		
		System.out.println("End");	
	}
}
