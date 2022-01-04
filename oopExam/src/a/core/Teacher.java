package a.core;

import a.core.Grade.Profession;

public class Teacher extends person {

	private Profession profession;

	public Teacher() {
		super();

	}

	public Teacher(String name, int age, Profession profession) {
		super(name, age);
		this.profession = profession;

	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Teacher [profession=" + profession + ", Name=" + getName() + ", Age=" + getAge() + "]";
	}
	
	

}
