package a.car;

public class Test {
	
	public static int haighwayNum=101;

	public static void main(String[] args) {
		
		Country country = getRandomCountry();
		System.out.println("num of cars in country: "+ country.getNumOfCars());
		for (Haighway h : country.getHaighways()) {
			if (h!=null) {
				System.out.println(h.getName()+"num of cars: "+ h.getNumOfCars());
			}
			
		}
		

		

	}


		
		
	
	
	public static Car getRandomCar() {
		int number = (int) (Math.random() * 1000) + 1000;
		int speed = (int) (Math.random() * 110);
		if (Math.random()< 0.5) {
			return new FamilyCar(number, speed);
		} else {
			return new SportCar(number, speed);
		}

	}
	
	public static Haighway getRandomHaighway() {
		Haighway haighway= new Haighway();
		haighway.setName("H"+haighwayNum);
		haighwayNum++;
		int number = (int) (Math.random() *Haighway.MAX);
		for (int i = 0; i < number; i++) {
			haighway.getCars()[i]=getRandomCar();
			
		}
		return haighway;
		
	}
	
	public static Country getRandomCountry() {
		Country country = new Country();
		
		int numberOfhi = (int)((Math.random())*4)+2;
		for (int i = 0; i < numberOfhi; i++) {
			country.getHaighways()[i]=getRandomHaighway();				
		}
		return country;
	}
		
		

}