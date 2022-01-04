package a;

public class testPoint {

	public static void main(String[] args) {
		
		point pt = new point();
		point pt2 = new point();
		
	
	
		
		pt.x= 25;
		pt.y= 300;
		
		pt.print();
		
		
		pt2.x= 5;
		pt2.y= 100;
		
		pt2.print();
		
		pt.moveRight();
		pt.moveLeft();
		pt.moveUp();
		pt.moveDown();
		
		pt.print();
	}

}
