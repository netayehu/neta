package c.animalls;

import c.interfaces.Flyer;
import c.interfaces.Navigator;
import c.vi.Bird;

public class Sparrow extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speaks like an Sparrow");
	}

	@Override
	public void navigator() {
		System.out.println("navigate like an Sparrow");
		
	}

	@Override
	public void fly() {

		System.out.println("fly like an Sparrow");
	}
	
	
	
	
	

}
