package app.beans;

public class Elevator {
	
	private int numberOfFloors;
	private int currentFloor;
	private int capacity;
	
	public Elevator() {
		
	}
	
	
	public Elevator(int numberOfFloors, int currentFloor, int capacity) {
		super();
		this.numberOfFloors = numberOfFloors;
		this.currentFloor = currentFloor;
		this.capacity = capacity;
	}


	public int getNumberOfFloors() {
		return numberOfFloors;
	}


	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}


	public int getCurrentFloor() {
		return currentFloor;
	}


	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
	

}
