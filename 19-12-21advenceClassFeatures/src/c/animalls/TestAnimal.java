package c.animalls;

import c.interfaces.AdvencedFlyer;
import c.interfaces.Flyer;
import c.interfaces.Navigator;
import c.vi.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		
		/*Animal[] animals = new Animal[5];
		animals[0]=new Cat();
		animals[1]=new Dog();
		animals[2]=new bat();
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if (animal!= null) {
				animal.speak();
				if (animal instanceof Flyer) {
					Flyer flyer = (Flyer)animal;
					flyer.fly();
					}
				}
			}*/
		
		Animal[] animals = new Animal[10];
		animals[0]=new Cat();
		animals[1]=new Dog();
		animals[2]=new bat();
		animals[3]=new Sparrow();
		animals[4]=new Ant();
		animals[5]=new Ostrich();
		animals[6]=new bat();
		animals[7]=new Sparrow();
		animals[8]=new bat();
		animals[9]=new Ant();
		
		for (Animal x : animals) {
			
			if(x !=null) {
				System.out.println(x.getClass().getSimpleName());
				x.speak();
				if (x instanceof AdvencedFlyer) {
					AdvencedFlyer af= (AdvencedFlyer)x;
					af.takeOff();
					af.fly();
					af.navigator();
					af.land();
				}else {
					if (x instanceof Flyer) {
						Flyer f= (Flyer)x;
						f.fly();
					}else {
						if (x instanceof Navigator) {
							Navigator n= (Navigator)x;
							n.navigator();
						}
					}
				}
			}else {
				System.out.println("-empty-");
			}
			System.out.println("================");
		}
			
			


	}

}
