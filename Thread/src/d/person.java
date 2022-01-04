package d;

public class person {
	private static int numberOfInstanceInMemory;

	private int id;
	private String name;
	
	{
		numberOfInstanceInMemory ++;
		this.id = numberOfInstanceInMemory;
	}
	
	
	public person(String name) {
		super();
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name +"is finalize");
		numberOfInstanceInMemory--;
		super.finalize();
	}
	
	public static int getNumberOfInstanceInMemory() {
		return numberOfInstanceInMemory;
	}
	
	
	
	
	public static void main(String[] args) {
		 
		person p1=new person ("aaa");
		person p2=new person ("bbb");
		person p3=new person ("ccc");
		
		System.out.println(person.getNumberOfInstanceInMemory());
		p2=null;
		System.gc();
		System.out.println(person.getNumberOfInstanceInMemory());
	}
	
	

	
}
