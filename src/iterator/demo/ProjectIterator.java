/**
 * 
 */
package iterator.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class ProjectIterator implements IProjectIterator{

	private ArrayList<IProject> projectList = new ArrayList<>();
	
	private int currentItem = 0;
	
	public ProjectIterator(ArrayList<IProject> projectLsit) {
		this.projectList = projectLsit;
	}
	
	public boolean hasNext() {
		boolean b = true;
		if(this.currentItem>=projectList.size()||this.projectList.get(this.currentItem)==null) {
			b = false;
		}
		return b;
	}
	
	public IProject next() {
		return (IProject)this.projectList.get(this.currentItem++);
	}
	
	public boolean remove() {
		return false;
	}
}
