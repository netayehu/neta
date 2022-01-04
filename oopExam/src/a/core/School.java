package a.core;

public class School {
	
	private ClassRoom[] classRooms = new ClassRoom[5];

	public School() {
		super();
	}

	public School(ClassRoom[] classRooms) {
		super();
		this.classRooms = classRooms;
	}

	public ClassRoom[] getClassRooms() {
		return classRooms;
	}

	public void setClassRooms(ClassRoom[] classRooms) {
		this.classRooms = classRooms;
	}
	
	public void addClassRoom(ClassRoom classRoom) {
		for (int i = 0; i < classRooms.length; i++) {
			if (classRooms[i]==null) {
				classRooms[i]=classRoom;
				return;
			}
		}
	}
	
	

}
