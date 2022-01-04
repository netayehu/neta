package b;

public class damo {
	public static void main(String[] args) throws InterruptedException {
		StopThread t1= new StopThread();
		StopThread d1= new StopThread();
		d1.setDaemon(true);
		
		
		t1.start();
		d1.start();
		
		Thread.sleep(3000);
		t1.interrupt();
		
		System.out.println("main ended");
	}
	

}
