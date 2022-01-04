package a;

public class ConcatDemo {

	public static void main(String[] args) {
		String firstName = "aaa";
		String lastName = "bbb";
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(firstName +" "+ lastName);
		
		int x=100;
		int y=200;
		
		System.out.println(x + "+" + y +"=" + (x+y) );
		
		//random num 
		System.out.println(Math.random());//0-0.9999
		System.out.println(Math.random()*11);//0-10.9999
		System.out.println((int)(Math.random()*11));//0-10
		
		
		int x1=(int)(Math.random()*101);
		int y1=(int)(Math.random()*101);
		System.out.println(x1 + "+" + y1 +"=" + (x1+y1) );
		System.out.println(x1 + "/" + y1 +"=" + ((x1+0D)/y1) );// to return ans in double.
		System.out.println(x1 + "*" + y1 +"=" + (x1*y1) );
		System.out.println(x1 + "-" + y1 +"=" + (x1-y1) );
		
		//random range
		int x2=(int)(Math.random()*10_001);
		System.out.println(x2);
		System.out.println(x2 %10);
		
		
		
		
		
		

	}

}
