package b.food;

public abstract class  Food {
	
	private double weight;
	private tastes taste;
	
	public enum tastes {
		
		SOUR, SWEET, SALTY, BITTER;

	}
	
	public Food() {
		
	}

	public Food(double weight, tastes taste) {
		super();
		this.weight = weight;
		this.taste = taste;
	}
	
	

	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public tastes getTaste() {
		return taste;
	}




	public void setTaste(tastes taste) {
		this.taste = taste;
	}





	@Override
	public String toString() {
		return "Food [weight=" + weight + ", taste=" + taste + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
