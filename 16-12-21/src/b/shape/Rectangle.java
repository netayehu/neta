package b.shape;

public class Rectangle extends Shape {
	
	private double length;
	private double wigth;
	
	
	public Rectangle() {
	
	}

		
	public Rectangle (String color, double length, double wigth) {
		super(color);
		this.length = length;
		this.wigth = wigth;
	}
	
	// sendig the const to the const up in the class
	public Rectangle(double length, double wigth) {
		
		this("black", length, wigth);
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWigth() {
		return wigth;
	}


	public void setWigth(double wigth) {
		this.wigth = wigth;
	}
	
	
}
