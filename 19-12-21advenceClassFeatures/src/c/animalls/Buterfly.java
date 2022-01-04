package c.animalls;

import c.interfaces.Flyer;
import c.vi.Insect;

public class Buterfly extends Insect implements Flyer {

	@Override
	public void speak() {
		System.out.println(" ");
	}

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
	}
	
	
	

}
