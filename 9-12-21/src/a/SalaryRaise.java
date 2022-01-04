package a;

public class SalaryRaise {

	public static void main(String[] args) {
		
		double update=0;
		
		int salary = (int)(Math.random()*(8000-5001)+5000);
		
		System.out.println("current salary: " + salary);
		
		if (salary <= 6000) {
			
			update = salary*1.1;
		} else {
			
			update = salary*1.05;
			
		}
		
		
		System.out.println("new salary: " + update);
		
		
	}

}
