package c;

public class person {

	private final int id;
	private String name;
	private int age;
	private static int counter;
	public static final int MAX_AGE = 120;
	
	static{
		if (Math.random()<0.5) {
			counter = 100;
		}else {
			counter = 1000;
		}
		System.out.println("class loaded - set to: "+ counter);
	}
	
	{
		System.out.println("person created");
		counter++;
		this.id = counter;
		
	}

	public person(int id, String name, int age) {
		super();
		this.name = name;
		setAge(age);
      
	}

	public person() {

		
	}
	public static int getCounter() {
		return counter;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<=MAX_AGE) {
			this.age = age;
		}
	}
	
	
	
	



	

}
