/**
 * 
 */
package strategy.demo.enumstrategy;

/**
 * @author Ang Li
 *
 */
public enum Calculator {

	ADD("+") {
		public int exec(int a, int b) {
			return a + b;
		}
	},

	SUB("-") {
		public int exec(int a, int b) {
			return a - b;
		}
	};

	String value = "";

	private Calculator(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static int cal(int a, int b, String symbol) throws IllegalArgumentException {
		for (Calculator c : Calculator.values()) {
			if (c.getValue().equals(symbol)) {
				return c.exec(a, b);
			}
		}
		throw new IllegalArgumentException("UnSupported Symbol");
	}

	public abstract int exec(int a, int b);
}
