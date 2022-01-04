package a.enams;

import a.enams.Car.Type;

public class Test {
	public static void main(String[] args) {
		
		colors c1 = colors.GREEN;
		System.out.println(c1);
		System.out.println(c1.ordinal());
		System.out.println("============");
		
		colors[] color = colors.values();
		for (colors colors2 : color) {
			System.out.println(colors2);
		}
		
		Car car = new Car(111, 0, colors.RED, Type.SPORT);
		
		System.out.println(car);
		
		
	}

}
