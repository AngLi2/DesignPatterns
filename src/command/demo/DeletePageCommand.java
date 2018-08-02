/**
 * 
 */
package command.demo;

/**
 * @author Ang Li
 *
 */
public class DeletePageCommand extends Command{

	public void execute() {
		super.pageGroup.find();
		super.requirementGroup.delete();
		super.requirementGroup.plan();
	}
}
