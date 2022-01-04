package d.singelton;

public class TestBank {

	public static void main(String[] args) {
		
		bank bank1 = bank.getInstance();
		bank bank2 = bank.getInstance();
		bank bank3 = bank.getInstance();
		
		bank1.addCostumer();
		bank1.addCostumer();
		bank1.addCostumer();
		
		bank2.removeCostumer();
		
		System.out.println(bank3.getNumberOfCostumers());

	}

}
