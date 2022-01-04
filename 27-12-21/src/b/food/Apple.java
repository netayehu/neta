package b.food;

public class Apple extends Fruits {

	public Apple(double weight, tastes taste) {
		super(weight, taste);
		
	}

	@Override
	public String toString() {
		return "Apple [Weight=" + getWeight() + ", Taste=" + getTaste() + "]";
	}
	
	
	
	

	
	

}
