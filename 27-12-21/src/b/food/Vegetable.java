package b.food;

public abstract class Vegetable extends Food {
	
	public Vegetable(){
		
	}
	

	public Vegetable(double weight, tastes taste) {
		super(weight, taste);
		
	}


	@Override
	public String toString() {
		return "Vegetable [Weight=" + getWeight() + ", Taste=" + getTaste() + "]";
	}
	
	
	
	
	

}
