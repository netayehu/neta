package d;

public class DemoRandom {

	public static void main(String[] args) {

		int r1 = (int) (Math.random() * 11);
		int r2 = (int) (Math.random() * 11) + 10;

		int a = 1005;
		int b = 1020;
		int r3 = (int) (Math.random() * (b - a + 1)) + a;

		System.out.println(r3);

	}

}
