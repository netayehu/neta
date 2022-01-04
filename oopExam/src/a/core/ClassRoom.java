package a.core;

import java.util.Arrays;


public class ClassRoom {
	
	private String name;
	private Teacher teacher;
	private Student[] students= new Student[15];
	
	
	public ClassRoom() {
		super();
	}


	public ClassRoom(String name, Teacher teacher, Student[] students) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.students = students;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public Student[] getStudents() {
		return students;
	}


	public void setStudents(Student[] students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", teacher=" + teacher + ", students=" + Arrays.toString(students) + "]";
	}  
	
	
	
	public boolean addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i]==null) {
				students[i]=student;
				return true;
			}
		}return false;
	}
	
	
	
	
	
	
	
	

}
