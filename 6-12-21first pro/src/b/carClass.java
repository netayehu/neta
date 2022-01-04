package b;

public class carClass {
	
	int num;
	String color;
	String type;
	int year;
	private int speed;
	
	public int getSpeed() {
		return speed;
		
	}
	
	public void setSpeed(int newSpeed) {
		if (newSpeed >= 0 && newSpeed <= 90) {
			speed = newSpeed;
		}
		
	}

}
