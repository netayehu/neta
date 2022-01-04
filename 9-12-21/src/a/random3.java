package a;

public class random3 {

	public static void main(String[] args) {
		
		int aa = (int)(Math.random()*(8000-1001)+1000);
		int bb = (int)(Math.random()*(8000-1001)+1000);
		int cc = (int)(Math.random()*(8000-1001)+1000);
		int a = 0;
		
		int num1 = aa;
		int num2 = bb;
		int num3 = cc;
	
		System.out.println("numbers:" +num1+","+num2+","+num3);
		
		if (num2 > num1) {
			a = num1;
			num1 = num2;
			num2 = a;	
		} 
		if (num3 >= num1) {
			a = num1;
			num1 = num3;
			num3 = num2;
			num2 = a;
		} else if(num3 >= num2) {
			a = num2;
			num2 = num3;
			num3 = a;
			
		}
		
		System.out.println("sort numbers:" +num3+","+num2+","+num1);
		System.out.println("revers sort numbers:" +num1+","+num2+","+num3);
		System.out.println("max: "+num1);		
		System.out.println("max: "+num3);		
		
		
	}

}
