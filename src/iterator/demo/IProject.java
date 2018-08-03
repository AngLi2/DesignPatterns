/**
 * 
 */
package iterator.demo;

/**
 * @author Ang Li
 *
 */
public interface IProject {

	public void add(String name, int num, int cost);
	
	public String getProjectInfo();
	
	public IProjectIterator iterator();
}
