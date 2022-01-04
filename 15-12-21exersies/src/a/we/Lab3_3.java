package a.we;

public class Lab3_3 {

	public static void main(String[] args) {
		int year  = (int) (Math.random() * 3001);
		
		if (year%100==0) {
			System.out.println(year+"  not leap year");
		}else if ((year%4==0)||(year%400==0)){
			System.out.println(year+"  leap year");
		}else {
			System.out.println(year+"  not leap year");
			
		}

	}

}
