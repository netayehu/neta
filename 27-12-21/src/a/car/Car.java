package a.car;

public class Car {
	
	private int number;
	private int speed;
	public static final int MIN_SPEED=0;
	public static final int MAX_SPEED=110;
	
	
	
	public Car() {
		
	}


	public Car(int number, int speed) {
		super();
		this.number = number;
		this.speed =0;
		setSpeed(speed);
		
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if ((speed<=MAX_SPEED)||(speed>=MIN_SPEED)) {
			this.speed = speed;	
		}
	}


	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + "]";
	}
	

	
	
	

}
