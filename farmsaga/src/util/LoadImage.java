package util;

import org.sikuli.script.Pattern;

public class LoadImage {
	// Image of Yahoo ID label
	private Pattern d;

	// Image of Yahoo password label
	private Pattern cr;

	// Image of Yahoo Signin button
	private Pattern t;

	// Image of Yahoo brand name
	private Pattern mt;
	
	// Image of Yahoo brand name
	private Pattern n;
	
	public LoadImage() {
		d= new Pattern("./img/d.jpg");
		cr= new Pattern("./img/cr.jpg");
		t= new Pattern("./img/t.jpg");
		mt= new Pattern("./img/mt.jpg");
		n= new Pattern("./img/n.jpg");
	}

	public Pattern getD() {
		return d;
	}

	public Pattern getCr() {
		return cr;
	}

	public Pattern getT() {
		return t;
	}

	public Pattern getMt() {
		return mt;
	}

	public Pattern getN() {
		return n;
	}
	
	
}
