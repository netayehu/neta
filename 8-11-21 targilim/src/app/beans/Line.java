package app.beans;

public class Line {
	
	private int length;
	
	public Line() {
	}
	

	public Line(int length) {
		super();
		this.length = length;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	public void draw() {
		
		for (int i=0 ; i<=length ; i++) {
		
		System.out.print("-");
		}
	}
	
	
	
	
	

	
	
	
}
