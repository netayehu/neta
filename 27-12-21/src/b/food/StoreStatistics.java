package b.food;

import b.food.Food.tastes;

public class StoreStatistics {

	public static void main(String[] args) {
		
		Store store=new Store();
		FillStore(store);
		store.show();
		System.out.println("haviest: "+ store.haviestApple());
		

	}
	
	
	
	public static void FillStore(Store store) {
		boolean notfull=true;
		while (notfull) {
			notfull=store.addFruit(getRandomFruits());
			
			
		}
		notfull=true;
		while (notfull) {
			notfull=store.addVegetable(getRandomVegetable());
			
			
		}
	}
	
	
	
	public static Fruits getRandomFruits() {
		tastes taste = tastes.values()[(int) (Math.random()*tastes.values().length)];
				if (Math.random()<0.5) {
					double weight = (Math.random()*101)+100;
					return new Apple(weight,taste);
					
				}else {
					double weight = (Math.random()*101)+100;
					return new Strawbery(weight,taste);
				}
		
	}
	
	public static Vegetable getRandomVegetable() {
		tastes taste = tastes.values()[(int) (Math.random()*tastes.values().length)];
				if (Math.random()<0.5) {
					double weight = (Math.random()*101)+100;
					return new Cerrot(weight,taste);
					
				}else {
					double weight = (Math.random()*101)+100;
					return new Tomatto(weight,taste);
				}
		
	}

}
