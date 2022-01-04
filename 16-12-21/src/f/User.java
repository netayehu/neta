package f;

import g.objects.Point;

public class User {
	
	private int id;
	private String name;
	private String email;
	private int password;
	
	
	public User() {
	}


	public User(int id, String name, String email, int password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	@Override
	public String toString() {
		
		return "User [id ="+id+ "name ="+ name+"email ="+ email+"password =" +password+"]";
	}


	@Override
	public int hashCode() {
		
		return id*5+127;
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User)) {
			return false;
		} 
		User other = (User)obj;
		return this.id == other.id;  
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
