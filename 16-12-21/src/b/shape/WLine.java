package b.shape;

public class WLine extends Line {
	
	private int width;
	

	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public void print(int length) {
		for (int i = 0; i < width; i++) {
			super.print(length);
		}
		
		
		System.out.println();
	}
	
	

}
