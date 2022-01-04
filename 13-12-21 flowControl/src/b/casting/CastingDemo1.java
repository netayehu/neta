package b.casting;

public class CastingDemo1 {

	public static void main(String[] args) {
		//converting from one type to another
		
		byte a=5;
		int b=a; //casting byte to int
		
		int x= 15;
		byte y = (byte)x;// casting int to byte. if overflwo return to the lowest.
		
		System.out.println(y);
		
		
		// casting from float to long
		float f1 = 5.3F;
		long num = (long)f1;
		
		System.out.println(f1);
		System.out.println(num);
		
		
		
	

		
		

	}

}
