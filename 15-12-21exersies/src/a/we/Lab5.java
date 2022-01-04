package a.we;

public class Lab5 {

	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 10001);
		int num2=num;
		int i=0;
		int left = 0;
		int opposite=0;
		//1
		System.out.println("number: "+num);
		
		while (num2>0) {
			i++;
			num2 = (int)(num2/10);
		}
		System.out.println("length of digits:"+i);
		
		//2
		System.out.println( "right digit: "+(num%10));
		
		//3
		
		num2=num;
		while (num2>0) {
			left = num2%10;
			num2 = (int)(num2/10);
		}
		System.out.println("left digit: "+ left);
		
		//4  opposite
		
		num2=num;
		while (num2>0) {
			opposite = opposite*10+ num2%10;
			num2 = (int)(num2/10);
		}
		System.out.println("opposite digit: "+ opposite);
		
		if (num==opposite) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
		
		

	}

}
