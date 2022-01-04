package e;

public class CarDriver extends Thread{
	Car car;
	private int travelDistance;
	
	
	public CarDriver(Car car, int travelDistance) {
		super();
		this.car = car;
		this.travelDistance = travelDistance;
	}
	@Override
	public void run () {
		
	}
	
	
	
	

}
