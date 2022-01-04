package b.food;



public class Store {
	
	private Fruits[] fruits= new Fruits[100];
	private Vegetable[] vegetables= new Vegetable[100];
	
	
	public Store() {
		
	}


	public Store(Fruits[] fruits, Vegetable[] vegetables) {
		super();
		this.fruits = fruits;
		this.vegetables = vegetables;
	}


	public Fruits[] getFruits() {
		return fruits;
	}


	public void setFruits(Fruits[] fruits) {
		this.fruits = fruits;
	}


	public Vegetable[] getVegetables() {
		return vegetables;
	}


	public void setVegetables(Vegetable[] vegetables) {
		this.vegetables = vegetables;
	}
	
	public boolean addFruit(Fruits fruit) {
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i]==null) {
				fruits[i]=fruit;
				return true;
			}
		}return false;
	}
	
	public boolean addVegetable(Vegetable vegetable) {
		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i]==null) {
				vegetables[i]=vegetable;
				return true;
			}
		}return false;
	}
	
	public void show() {
		
		
		System.out.println("stor stock:");
		System.out.println("fruits:");
		
		for (Fruits fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("Vegetable:");
		for (Vegetable veg : vegetables) {
			System.out.println(veg);
		}
		
	}
		
	public double haviestApple() {
		double max=0;
		for (Fruits  fruit : fruits) {
			if (fruit.getWeight()>max) {
				max = fruit.getWeight();			
			}			
		}
		return max;
	}


	
	
	
	

}
