package a.we;

public class Lab3TaxCalculato1 {

	public static void main(String[] args) {
	
		double salary  = (int) (Math.random() * 50001);
		double tax=0;
		double m1 =0.1;
		double m2 =0.2;
		double m3 =0.3;
		double m4 =0.4;
		
		System.out.println("salary: "+salary);
		
		if (salary<=23000) {
			tax = salary*m1;

		}else if(salary<=50000) {
			tax = ((salary-23000)*m2)+(23000*m1);

		}else if(salary<=100000) {
			tax = ((salary-50000)*m3)+(23000*m1)+(27000*m2);

		}else if(salary>100000) {
			tax = ((salary-100000)*m4)+(23000*m1)+(27000*m2)+(27000*m3);

		}
		
		System.out.println("tax: "+tax);
		System.out.println("salary: "+(salary-tax));

	}

}
