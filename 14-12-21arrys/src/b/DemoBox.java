package b;

public class DemoBox {

	public static void main(String[] args) {
		Box b1 = new Box(100,20,5);
		System.out.println("length: "+ b1.getLength());
		System.out.println("Width: "+ b1.getWidth());
		System.out.println("Heigth: "+ b1.getHeigth());
		
		Box[] boxes = new Box[2];
		
		boxes[0] = new Box(1,1,1);
		boxes[1] = new Box(2,3,4);
		
		Box b = boxes[0];
		
		System.out.println(b.getLength());
		//same same
		
		System.out.println((boxes[0].getLength()));
		
		
	
		
		
	}

}
