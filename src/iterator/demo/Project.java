/**
 * 
 */
package iterator.demo;

import java.util.ArrayList;

/**
 * @author Ang Li
 *
 */
public class Project implements IProject{

	private ArrayList<IProject> projectList = new ArrayList<>();
	
	private String name = "";
	
	private int num = 0;
	
	private int cost = 0;
	
	public Project() {
		
	}
	
	private Project(String name, int num, int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}
	
	public void add(String name, int num, int cost) {
		this.projectList.add(new Project(name, num, cost));
	}
	
	public String getProjectInfo() {
		String info = "";
		info+="The Project Name is "+this.name;
		info+="\t The Member Number is "+this.num;
		info +="\t The Cost of Project is "+this.cost;
		return info;
	}
	
	public IProjectIterator iterator() {
		return new ProjectIterator(this.projectList);
	}
}
