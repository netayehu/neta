package a;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person();

		try {
			p.setAge(0);
		} catch (PersonAgeExeption e) {
			System.out.println(e.getMessage());

		}
		System.out.println(p.getAge());
		System.out.println("END");

	}

}
