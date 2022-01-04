package d;

public class forLoop {
	
	public static void main(String[] args) {
		
		for (int i = 101; i<= 110;i++) {
			System.out.println(i);
		}
		
		System.out.println("=============");
		
		for (int j = 100; j>= 50;j--) {
			System.out.println(j);
		}
		
		System.out.println("=============");
		
		for (int j = 100; j<= 200;j+=2) {
			System.out.println(j);
		}
		
		System.out.println("=============");
		
		for (int j = 0; j<= 100;j+=7) {
			
			System.out.println(j);
			
		}
		
		System.out.println("=============");
		
		for (char j = 'A'; j<= 'Z';j++) {
			System.out.println(j +" "+(int)j); //the char with its unicode
		}
		
		for (int j = 0; j<= 10;j++) {
				System.out.println(j+ "-"+(10-j));
		}
		
		for (int i=0, j = 10; i<= 10 && j>=0;i++, j--) {
			System.out.println(i+ "-"+j);
	}
		
		

		
		
		
		
		
			
			
		
	}

}
