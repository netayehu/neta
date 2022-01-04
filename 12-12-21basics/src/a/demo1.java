package a;

public class demo1 {

	public static void main(String[] args) {
		byte n1=5;
		short n2 = 5;
		int n3 = 5;
		long n4 = 99999999999999L;
		
		float n5 = 5.5F;
		double n6 = 5.5;
		
		
		int sum = n1+n3;
		
		
		{ //scope
			int x =5;
			System.out.println(x);
		}
		System.out.println("==============");
		{
			int x =5;
			System.out.println(x);
			
		}
		
		

	}

}
