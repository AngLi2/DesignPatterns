/**
 * 
 */
package interpreter.demo;

import java.util.HashMap;

/**
 * @author Ang Li
 *
 */
public class VarExpression extends Expression{

	private String key;
	
	public VarExpression(String key) {
		this.key = key;
	}
	
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
