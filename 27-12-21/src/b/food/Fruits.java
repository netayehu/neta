package b.food;

public abstract class Fruits extends Food {
	
	
	public Fruits() {
		
	}
	

	public Fruits(double weight, tastes taste) {
		super(weight, taste);
		
	}


	@Override
	public String toString() {
		return "Fruits [Weight=" + getWeight() + ", Taste=" + getTaste() + "]";
	}
	
	

	
	
	
	
	
	

}
