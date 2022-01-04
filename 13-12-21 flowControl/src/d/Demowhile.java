package d;

import java.util.Scanner;

public class Demowhile {

	public static void main(String[] args) {
		
		 
/*		int caunter = 1;
		
		while(caunter <= 10) {
			System.out.println(caunter);
			caunter++;
			
		}*/
		
		int password = 123;
		int i=1; //var to stop after 3 logs
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter password:");
		int input = sc.nextInt();
		
		
		while (input != password && i<3) {
			
			System.out.println("enter password:");
			input = sc.nextInt();
			i++;
			
			
		} 
		sc. close();
		if (input==password) {
			System.out.println("great");
		}else {
		System.out.println("wrong");
		}
		
		
		

	}

}
