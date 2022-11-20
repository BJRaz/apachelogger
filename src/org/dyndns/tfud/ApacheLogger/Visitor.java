package org.dyndns.tfud.ApacheLogger;

public class Visitor {
	private String uri, logtxt;
	/**
	 * Method Visitor
	 *
	 *
	 */
	public Visitor(String uri) {
		// TODO: Add your code here
		this.uri = uri;
	}	
	
	/**
	 * Method Visitor
	 *
	 *
	 */
	public Visitor(String uri, String logtxt) {
		// TODO: Add your code here
		this.uri = uri;
		this.logtxt = logtxt;
	}
	
	
	public String getUri() {
		return uri;
	}
	
	public void setUri(String uri) {
		this.uri = uri;
	}
	
	public String toString() {
		return "IP: " + this.uri;
	}
        
        
	
	public boolean equals(Object obj) {
		Visitor temp = (Visitor)obj;
		if(temp.getUri().equals(this.uri))
			return true;
		return false;
	}
	
}
