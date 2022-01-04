package b.shape;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Shape("yellow");
		
		System.out.println(s1.getColor());
		System.out.println(s2.getColor());
		
		s1.setColor("red");
		System.out.println(s1.getColor());
		

	}

}
