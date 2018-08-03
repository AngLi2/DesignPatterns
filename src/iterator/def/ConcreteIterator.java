package iterator.def;
import java.util.Vector;

/**
 * 
 */

/**
 * @author Ang Li
 *
 */
public class ConcreteIterator implements Iterator{
	
	public Vector<Integer> vector = new Vector<>();
	public int cursor = 0;
	
	public ConcreteIterator(Vector<Integer> vector) {
		this.vector = vector;
	}
	
	public boolean hasNext() {
		if(this.cursor == this.vector.size()) {
			return false;
		}else {
			return true;
		}
	}
	
	public Object next() {
		Object result = null;
		if(this.hasNext()) {
			result = this.vector.get(this.cursor++);
		}else {
			result = null;
		}
		return result;
	}
	
	public boolean remove() {
		this.vector.remove(this.cursor);
		return true;
	}

}
