/**
 * 
 */
package chainofresponsibility.def;

import java.util.logging.Level;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;

import proxy.def.dynamic.Advice;

/**
 * @author Ang Li
 *
 */
public abstract class Handler {

	private Handler nextHandler;
	
	public final Response handleMessage(Request request) {
		Response response = null;
		if(this.)
	}
	
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	
	protected abstract Level getHandlerLevel();
	
	protected abstract Response echo(Request request);
}
