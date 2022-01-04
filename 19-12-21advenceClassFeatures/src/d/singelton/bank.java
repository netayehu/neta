package d.singelton;

public class bank {
	
	//1. private CTOR
	private bank() {
		
	}
	
	//2. private static instance of  bank
	private static bank instance = new bank();
	
	//3. public static getter for the bank instance
	public static bank getInstance() {
		return instance;
	}
	
	//------------------
	
	private int numberOfCustomers;
	
	public void addCostumer() {
		numberOfCustomers++;
	}
	public void removeCostumer() {
		numberOfCustomers--;
	}
	public int getNumberOfCostumers() {
		return numberOfCustomers;
	}
	
	
	

}
