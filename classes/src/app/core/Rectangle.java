package app.core;

public class Rectangle {
	
	
	private int length;
	private int width;
	
public Rectangle() { 
		
	}
	
	public Rectangle(int length, int width) {
		this.length =length;
		this.width = width;
		
	}

	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width ) {
		this.width = width;
	}
	
	
	
	public int getArea() {
		return width*length ;
	}
	
	
	public int getParimeter() {
		return 2 * (width + length);
	}
	public void print() {
		
		System.out.print(" width is: ");
		System.out.println(width);
		System.out.print("length is: ");
		System.out.println(length);
		
		
		
		
	}
	
	

}
