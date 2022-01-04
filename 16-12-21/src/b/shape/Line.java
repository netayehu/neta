package b.shape;

public class Line {

	
	private int length;
	


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
	
	public void print(int length) {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	
	
}