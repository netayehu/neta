package c.animalls;

import c.interfaces.AdvencedFlyer;
import c.vi.mammal;

public class bat extends mammal implements AdvencedFlyer{

	@Override
	public void speak() {
		System.out.println("SQUEEE");
	
	}
	
	@Override
	public void fly() {
		System.out.println("fly like a bat");
	
	}

	@Override
	public void navigator() {
		System.out.println("navigate like a bat");
		
	}

	@Override
	public void takeOff() {
		System.out.println("takeoff like a bat");
		
	}

	@Override
	public void land() {
		System.out.println("land like a bat");
		
	}
	

}
