package WaitAndNotifay;

public class consumer extends Thread {

	private Stack stack;

	public consumer(String name, Stack stack) {
		super(name);
		this.stack = stack;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			int r = stack.pop();
			System.out.println("/t" + getName() + "popped: " + r);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
