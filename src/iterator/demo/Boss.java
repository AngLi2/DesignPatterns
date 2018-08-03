/**
 * 
 */
package iterator.demo;

/**
 * @author Ang Li
 *
 */
public class Boss {

	public static void main(String[] args) {
		IProject project = new Project();
		
		project.add("StarCraft", 10, 100000);
		project.add("WarCraft", 100, 1000000);
		project.add("Dota", 1000, 1000000000);
		
		for(int i = 4;i<104;i++) {
			project.add("The Number "+i, i*5, i*10000000);
		}
		
		IProjectIterator projectIterator = project.iterator();
		while(projectIterator.hasNext()) {
			IProject p = (IProject)projectIterator.next();
			System.out.println(p.getProjectInfo());
		}
	}

}
