package b;

public class personTest {
	
	public static void main(String[] args) {
		
		person p1 = new person();
		person p2 = new person(100, "nu",18);
		
		System.out.println(p1.getId());
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("**********************");
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println("**********************");
		
		
		
		
		
	}
	

}
