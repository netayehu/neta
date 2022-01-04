package a;

public class Person {
	
	private int id;
	private String name;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	//0-120 - throw chekd exeption
	public void setAge(int age) throws PersonAgeExeption {
		if (age>=0 && age<=120) {
		this.age = age;
		}else {
			throw new PersonAgeExeption ("setAge failed: "+ age+"illegal");
		}
	}
	
	
	
	

}
