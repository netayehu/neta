package a;

public class Demo2 {
	
	public static void main(String[] args) {
		
		MyRunnable mr= new MyRunnable();
		
		Thread th =new Thread(mr,"t1");
		Thread th1 =new Thread(mr,"t2");
		
		th.start();
		th1.start();
	}

}
