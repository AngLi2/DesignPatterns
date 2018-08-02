/**
 * 
 */
package proxy.demo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Ang Li
 *
 */
public class Client {
	
	public static void main(String[] args) {

		GamePlayer gamePlayer = new GamePlayerImpl("Zhangsan");

		InvocationHandler invocationHandler = new GamePlayIH(gamePlayer);

		System.out.println("Start Time is 2018/7/27");

		ClassLoader c1 = gamePlayer.getClass().getClassLoader();

		GamePlayer proxy = (GamePlayer) Proxy.newProxyInstance(c1, new Class[] { GamePlayer.class }, invocationHandler);

		proxy.login("zhangsan121", "password");

		proxy.killBoss();

		proxy.upgrade();

		System.out.println("End");
	}

}

