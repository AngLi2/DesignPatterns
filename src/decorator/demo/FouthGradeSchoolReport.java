/**
 * 
 */
package decorator.demo;

/**
 * @author Ang Li
 *
 */
public class FouthGradeSchoolReport extends SchoolReport{

	public void report() {
		System.out.println("XX's Parents:");
		System.out.println("......");
		System.out.println("Java 62 Python 65 Ruby 98 C 63");
		System.out.println("......");
		System.out.println("Parents's Signature:");
	}
	
	public void sign(String name) {
		System.out.println("Parents' Signature is: " +name);
	}
}
