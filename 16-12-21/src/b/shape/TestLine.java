package b.shape;

public class TestLine {

	public static void main(String[] args) {
	
		Line line= new Line(5);
		line.print(5);
		System.out.println(line.getLength());
		line.setLength(15);
		line.print(15);
		System.out.println(line.getLength());
		
		
		Line l1 = new WLine(5,6);
		l1.print(5);
		
	}

}
