package d;

import java.util.Scanner;

public class Demo7boom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter num1:");
		int a = sc.nextInt();
		System.out.println("enter num2:");
		int b = sc.nextInt();
		sc. close();
		
		boolean r;
		int number = 0;
		if (a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		
		for (int i=a;i<=b;i++) {
			r=false;
			if (i%7==0) {
				r= true;
			}
			
			number = i;
			
			while (number>9) {
				if (number%10==7) {
					r=true;
				}
					number = (int)number/10;
				
			}
		
			if (r==true) {
				System.out.println("boom");
			
			} else {
				System.out.println(i);
			}
			
		}
		
	
		
		 
		

	}
}


