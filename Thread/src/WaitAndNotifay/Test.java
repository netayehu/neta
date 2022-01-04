package WaitAndNotifay;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Stack stack = new Stack();
		Producer p1= new Producer("p1", stack);
		p1.start();
		
		consumer c1= new consumer("c1", stack);
		consumer c2= new consumer("c2", stack);
		Thread.sleep(3000);
		c1.start();
		c2.start();
		
		
	}

}
