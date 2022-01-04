package c.animalls;

import c.interfaces.Navigator;
import c.vi.Insect;

public class Ant extends Insect implements Navigator{

	@Override
	public void speak() {
		
		System.out.println("speahs like an ant");
	}

	@Override
	public void navigator() {
		System.out.println("navigate like an ant");
		
	}
	
	
	

}
