/**
 * 
 */
package strategy.demo.general;

import java.util.Arrays;

/**
 * @author Ang Li
 *
 */
public class Client {

	public final static String ADD_SYMBOL = "+";

	public final static String SUB_SYMBOL = "-";

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);

		String symbol = args[1];

		int b = Integer.parseInt(args[2]);

		System.out.println("Input is: " + Arrays.toString(args));

		Context context = null;

		if (symbol.equals(ADD_SYMBOL)) {
			context = new Context(new Add());
		} else if (symbol.equals(SUB_SYMBOL)) {
			context = new Context(new Sub());
		}

		System.out.println("Output is " + a + symbol + b + " = " + context.exec(a, b));
	}

}
