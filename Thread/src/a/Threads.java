package a;

public class Threads extends Thread {
	
	public Threads( String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 101; i++) {
			System.out.println(getName()+ ":"+i);
		}
		
	}
	



}
