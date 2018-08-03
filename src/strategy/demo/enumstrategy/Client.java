/**
 * 
 */
package strategy.demo.enumstrategy;

import java.util.Arrays;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		String symbol = args[1];

		int b = Integer.parseInt(args[2]);

		System.out.println("Input is " + Arrays.toString(args));

		System.out.println("Output is " + a + symbol + b + " = " + Calculator.cal(a, b, symbol));
	}

}
