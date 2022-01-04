package a;



public class Calculator {
	
		
		public int div(int a, int b) throws Exception {
			if (b!=0) {
				return a/b;
			}else {
				// throw 
				Exception e = new Exception("error");
				throw e;
			}
		}
	 

}
