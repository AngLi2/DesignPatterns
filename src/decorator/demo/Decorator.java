/**
 * 
 */
package decorator.demo;

/**
 * @author Ang Li
 *
 */
public abstract class Decorator extends SchoolReport{

	private SchoolReport schoolReport;
	
	public Decorator(SchoolReport schoolReport) {
		this.schoolReport = schoolReport;
	}
	
	public void report() {
		this.schoolReport.report();
	}
	
	public void sign(String name) {
		this.schoolReport.sign(name);
	}
}
