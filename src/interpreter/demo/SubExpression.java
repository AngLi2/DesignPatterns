/**
 * 
 */
package interpreter.demo;

import java.util.HashMap;

/**
 * @author Ang Li
 *
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
