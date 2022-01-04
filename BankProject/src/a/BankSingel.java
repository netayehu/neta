package a;

public class BankSingel {
	
	private Client[] clients = new Client[100];
	private  float balance;
	int accountUpdater;
	private Logger logger;
	
	
	private BankSingel() {
		Client[] clients = new Client[100];
		
	}
	
	private static BankSingel instance = new BankSingel();
	
	public static BankSingel getInsstance() {
		return instance;
	}
	
	
	
	public float getBalance() {
		return balance;
	}
	
	
	public float getTotalFortune() {
		float sum=0;
		for (int i = 0; i < clients.length; i++) {
			sum += clients[i].getFortune();
		}
		return sum + balance;
	}
	
	
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i]==null) {
				clients[i]=client;
				Log log = new Log(System.currentTimeMillis(), client.getId(), "add Client ", client.getBalance());
				logger.log(log);
			}
		}
	}

	
	public void removeClient (int id) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getId()==id) {
				Log log = new Log(System.currentTimeMillis(), clients[i].getId(), "remove Client ", clients[i].getBalance());
				logger.log(log);
				clients[i]=null;
			}
		}
	}
	
	
	
	public Client [] getClients() {
		return null;

	}
	
	public void viewlogs() {
		
	}
	
	public void startAccountUpdater() {
		
	}
	
	public void addCommission(float commition) {
		balance+=commition;
	}
	
	public void printClientList() {
		

	}

	
	
	
}
