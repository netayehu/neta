package e.fibonachi;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		int aa=1;
		int bb=1;
		int cc = 1;
		//fibonachi gs 40
		System.out.println(aa);
		System.out.println(bb);
		
		for (int i=0; i<40;i++) {
			cc=aa+bb;
			aa=bb;
			bb=cc;
			System.out.println(cc);
		}
		
		//fibonachi random index
		
		int j= (int) (Math.random()*40);
		
		System.out.println(j);
		
		for (int i=2; i<=j;i++) {
			cc=aa+bb;
			aa=bb;
			bb=cc;
		}
		System.out.println(cc);
		
		//fibonachi random10-50 print 1-random
		
		int k= (int) (Math.random()*51)+10;
		
		System.out.println(k+":");
		System.out.println(aa);
		System.out.println(bb);
		
		for (int i=1; i<=k;i++) {
			cc=aa+bb;
			aa=bb;
			bb=cc;
		System.out.println(cc);
		}
		
		
		
		
		
		
		
		

	}

}
