/**
 * 
 */
package proxy.def;

/**
 * @author Ang Li
 *
 */
public class Proxy implements Subject{

	private Subject subject = null;
	
	public Proxy() {
		this.subject = new Proxy();
	}
	
	public Proxy(Object...objects) {
		
	}
	
	public Proxy(Subject subject) {
	
	}
	
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before() {
		
	}
	
	private void after() {
		
	}
}
