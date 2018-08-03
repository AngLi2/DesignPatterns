/**
 * 
 */
package decorator.demo;

/**
 * @author Ang Li
 *
 */
public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportSort() {
		System.out.println("The ranking is 38");
	}
	
	public void report() {
		this.reportSort();
		super.report();
	}
}
