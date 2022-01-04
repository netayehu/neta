package e;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private int number;
	private int km;
	private List<String> registeredDrivers=new ArrayList<String>();
	
	
	public Car(int number) {
		super();
		this.number = number;
	}
	
	public void registerDriver() {
		
	}
	public synchronized void drive(int distance) {
		System.out.println();
		
	}
	
	
	
	
}
