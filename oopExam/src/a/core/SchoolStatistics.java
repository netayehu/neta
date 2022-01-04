package a.core;

import a.core.Grade.Profession;

public class SchoolStatistics {

	public static int classroomnum = 1;

	public enum persons {
		BEN, ELI, RON, MOSHE, AVI, NOAM, MIKI, GAD, DAN, BENI, DOR, SHUKI
	}

	public static void main(String[] args) {
		
	
			
		
		
		
		

	}

	public static Student getRandomStudent() {

		int age = (int) (Math.random() * person.MAX_AGE-person.MIN_AGE) + person.MIN_AGE;
		String name = persons.values()[(int) (Math.random() * persons.values().length)].toString();
		Student student = new Student(name, age);

		//Grade[] grades = new Grade[6];

		for (int i = 0; i < Profession.values().length; i++) {
			Profession profession = Profession.values()[i];
			int score = (int) (Math.random() * Grade.MAX_GRADE-Grade.MIN_GRADE) + Grade.MIN_GRADE;
			Grade grade = new Grade(profession, score);
			//grades[i] = grade;
			student.addGrade(grade);
		}

//		student.setGrades(grades);
		return student;
	}

	public static Teacher getRandomTeacher() {

		String name = persons.values()[(int) (Math.random() * persons.values().length)].toString();
		int age = (int) (Math.random() * 100) + 20;
		Profession pro = Profession.values()[(int) (Math.random() * Profession.values().length)];

		return new Teacher(name, age, pro);
	}

	public static ClassRoom getRandomClassRoom() {
		String name = "classroom" + classroomnum;
		classroomnum++;
		Teacher teacher = getRandomTeacher();
		Student[] students= new Student[15];
		for (int i = 0; i < students.length; i++) {
			students[i] = getRandomStudent();
				
		}
		ClassRoom classRoom = new ClassRoom(name,teacher,students);
		

		return classRoom;
	}
	
	public static School getRandomSchool() {
		ClassRoom[] classRooms = new ClassRoom[5];
		for (int i = 0; i < classRooms.length; i++) {
			classRooms[i] = getRandomClassRoom();
		
		return  School(); 
		
		
	}

}
