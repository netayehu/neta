package g.objects;

public class Point {
	
	private int x;
	private int y;
	
	
	public Point() {
		super();
	}


	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "point(" + x+ ","+y+")";
	}


	@Override
	public int hashCode() {
		return (x+y)*2;
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		} 
		Point other = (Point)obj;
		return this.x == other.x && this.y == other.y; 
		
	}
	
	
	
	

}
