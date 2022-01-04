package a.car;

public class SportCar extends Car {

	public SportCar() {
		super();
		
	}

	public SportCar(int number, int speed) {
		super(number, speed);
		
	}

	@Override
	public String toString() {
		return "SportCar [Number" + getNumber() + ", Speed" + getSpeed() + "]";
	}
	
	
	
	

}
