package a.car;

import java.util.Arrays;

public class Haighway {
	
	public static final int MAX=100;
	
	private String name;
	private Car[] cars= new Car[100];
	
	
	public Haighway(String name, Car[] cars) {
		super();
		this.name = name;
		this.cars = cars;
	}
	


	public Haighway() {
		super();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}
	
	



	@Override
	public String toString() {
		return "Haighway [name=" + name + ", cars=" + Arrays.toString(cars) + "]";
	}



	public boolean addFamilyCar(FamilyCar familyCar) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i]==null) {
				cars[i]=familyCar;
				return true;
			}
		}return false;
	}
	
	public boolean addSportCar(SportCar sportCar) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i]==null) {
				cars[i]=sportCar;
				return true;
			}
		}return false;
	}
	
	public int getNumOfCars() {
		int count=0;
		for (Car car : cars) {
			if (car!=null){
				count++;
			}
		}
		return count;
	}
	
	
	
		

	
		
	}
	
	
	
	
	


