package a;

public class Demo1 {

	public static void main(String[] args) {
		
	
		Threads threads= new Threads("great name");
		Threads threads1= new Threads("th1");
		Threads threads2= new Threads("th2");
		Threads threads3= new Threads("th3");
		Threads threads4= new Threads("th4");
		Threads threads5= new Threads("th5");
		threads.start();
		threads1.start();
		threads2.start();
		threads3.start();
		threads4.start();
		threads5.start();
		// anouther way:
		Threads[] threadss= {threads,threads1,threads2,threads3,threads4,threads5};
		for (String string : args) {
			
		}
		
		//to have main name
		Thread currThread = Thread.currentThread();
		
		for (int i = 0; i < 101; i++) {
			System.out.println(currThread.getName()+":"+ i);
		}

	}

}
