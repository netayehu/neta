package app.beans;

public class Country {
	
	private	int id;
	private	String name;
	private	String population;
	private	String area;
	
	
	public Country() {
	}
	
	public Country(int id, String name, String population, String area) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.area = area;
	}

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

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void print() {
		
		System.out.println("name: " + name);
		System.out.println("id: " + id);
		System.out.println("population: " + population);
		System.out.println("area: " + area);
		
		
	}
	
	
	
	
	
	
	
	
	

}
