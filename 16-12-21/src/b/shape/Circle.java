package b.shape;

public class Circle extends Shape {
	
	private double radius;

	public Circle() {
		super();
	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	
	

}
