package a.core;

import java.util.Arrays;

public class Student extends person {

	private Grade[] grades = new Grade[6];

	public Student() {

	}

	public Student(String name, int age) {
		super(name, age);
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public Student(String name, int age, Grade[] grades) {
		super(name, age);
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [grades=" + Arrays.toString(grades) + ", Name()=" + getName() + ", Age()=" + getAge() + "]";
	}

	public void addGrade(Grade grade) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == null) {
				grades[i] = grade;
				return;
			}
		}
		
	}

}
