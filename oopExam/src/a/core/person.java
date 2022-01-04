package a.core;

public class person {
	
	private String name;
	private int age;
	
	public static final int MIN_AGE=20;
	public static final int MAX_AGE=120;
	
	
	public person() {
		super();
	}


	public person(String name, int age) {
		super();
		this.name = name;
		setAge(age);
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
		if ((age<=MAX_AGE)||(age>=MIN_AGE)) {
		this.age = age;
		}
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
