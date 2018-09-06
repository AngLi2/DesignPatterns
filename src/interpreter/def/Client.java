/**
 * 
 */
package interpreter.def;

import java.util.Stack;

/**
 * @author Ang Li
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		Stack<Expression> stack  = null;
		
//		for(;;) {
//			
//		}
		
		Expression expression = stack.pop();
		
		expression.interpreter(context);
	}
}
