package a.car;

import java.util.Arrays;

public class Country {

	private Haighway[] haighways= new Haighway[5];
	
	

	public Country() {
		super();
	}

	public Country(Haighway[] haighways) {
		super();
		this.haighways = haighways;
	}

	public Haighway[] getHaighways() {
		return haighways;
	}
	

	
	public void setHaighways(Haighway[] haighways) {
		this.haighways = haighways;
	}
	
	

	@Override
	public String toString() {
		return "Country[haighways=" + Arrays.toString(haighways) + "]";
	}

	public boolean addHaighway(Haighway haighway) {
		for (int i = 0; i < haighways.length; i++) {
			if (haighways[i]==null) {
				haighways[i]=haighway;
				return true;
			}
		}return false;
	}
	
	public int getNumOfCars() {
		int count=0;
		for (Haighway haighway : haighways) {
			if (haighway!=null){
				count+= haighway.getNumOfCars() ;
			}
		}
		return count;
	}
	
	
}
