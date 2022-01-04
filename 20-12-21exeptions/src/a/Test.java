package a;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Calculator c= new Calculator();
		
		try {
			int res= c.div(10,0 );
			System.out.println(res);
		}catch(Exception e){
			System.out.println("the divide methud faild:" +e.getMessage());
		}
		
		System.out.println("==============");
		
		String s= "123";
	   
	
	
	
		Scanner sc= new Scanner(System.in);
		
		while(true) {
	
			try {
			
				System.out.println("Enter first number- ");    
				int r= Integer.parseInt(sc.nextLine());  
				System.out.println("Enter second number- ");  
				int l= Integer.parseInt(sc.nextLine());  
				System.out.println(r+"+"+l+"="+(r+l));
				break;
			}catch(Exception e){
				System.out.println("you enterd wrong input");
			}
		
			
		}
		sc.close();
	}
}
