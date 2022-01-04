package a;

public abstract class Client {

//atributes
	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	protected float commissionRate = 0;
	protected float interestRate = 0;
	private Logger logger;

//constractors
	public Client(int id, String name, float balance, Account[] accounts, float commissionRate, float interestRate,
			Logger logger) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accounts = accounts;
		this.commissionRate = commissionRate;
		this.interestRate = interestRate;
		this.logger = logger;
	}

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	// methouds

	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				Log log = new Log(System.currentTimeMillis(), id, "add Account: " + account.getId(),
						account.getBalance());
				logger.log(log);
				return;

			}
		}
	}

	public Account getAccount(int id) {
		for (int i = 0; i < accounts.length; i++) {
			if (id == accounts[i].getId()) {
				return accounts[i];
			}
		}
		return null;

	}

	public void removeAccount(int id) {

		for (int i = 0; i < 5; i++) {
			if (id == accounts[i].getId()) {
				balance = balance + accounts[i].getBalance();
				Log log = new Log(System.currentTimeMillis(), this.id, "remove Account: " + id,
						accounts[i].getBalance());
				logger.log(log);
				accounts[i] = null;
			}
		}
	}

	public void deposit(float amount) {
		balance = balance + amount - commissionRate*amount;
		Log log = new Log(System.currentTimeMillis(), id, "deposit: ", amount - commissionRate*amount);
		logger.log(log);
		BankSingel.addCommission(commissionRate*amount);

	}

	public void withdraw(float b) {
		balance = balance - b - commissionRate*b;
		Log log = new Log(System.currentTimeMillis(), id, "withdraw: ", b);
		logger.log(log);
	}

	public void autoUpdateAccounts() {
			float x;
			for (int i = 0; i < accounts.length; i++) {
				x= accounts[i].getBalance()+interestRate;
				accounts[i].setBalance(x);
				Log log = new Log(System.currentTimeMillis(), id, "autoUpdateAccounts ", x);
				logger.log(log);
			}
	}

	public float getFortune() {
			float sum=0;
			for (int i = 0; i < accounts.length; i++) {
				sum += accounts[i].getBalance();	
			}
			return sum+balance;
	}
			


}
