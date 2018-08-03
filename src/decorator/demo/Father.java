/**
 * 
 */
package decorator.demo;

/**
 * @author Ang Li
 *
 */
public class Father {

	public static void main(String[] args) {
		
		SchoolReport schoolReport;
		
		schoolReport = new FouthGradeSchoolReport();
		
		schoolReport = new HighScoreDecorator(schoolReport);
		
		schoolReport = new SortDecorator(schoolReport);
		
		schoolReport.report();
		
		schoolReport.sign("Zhangsan");
	}

}
