/**
 * 
 */
package decorator.demo;

/**
 * @author Ang Li
 *
 */
public class HighScoreDecorator extends Decorator{

	public HighScoreDecorator(SchoolReport schoolReport) {
		super(schoolReport);
	}
	
	private void reportHighScore() {
		System.out.println("Java 62 Python 65 Ruby 98 C 63");
	}
	
	public void report() {
		this.reportHighScore();
		super.report();
	}
}
