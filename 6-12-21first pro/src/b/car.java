package b;

public class car {

	public static void main(String[] args) {
		
		carClass car1 = new carClass();
		carClass car2 = new carClass();
		 
		/*car1.num =123456 ;
		car1.color = "red";
		car1.type ="subaro"; 
		car1.year =2018; 
		
		System.out.println(car1.num);
		System.out.println(car1.color);
		System.out.println(car1.type);
		System.out.println(car1.year); */
		
		car1.setSpeed(88);
		
		System.out.println(car1.getSpeed());
		
		
		
	}

}
