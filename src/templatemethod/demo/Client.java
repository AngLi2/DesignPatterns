/**
 * 
 */
package templatemethod.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) throws IOException{
		System.out.println("--- H1 Hummer ---");
		System.out.println("Is H1 Hummer need alarm? 0 - No  1- Yes");
		String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		HummerH1Model h1 = new HummerH1Model();
		if(type.equals("0")) {
			h1.setAlarm(false);
		}
		h1.run();
		
		System.out.println("--- H2 Hummer ---");
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}

}
