package a.core;

public class Grade {
	
	public enum Profession {
		
		MATH, CHEMISTRY, GEOGRAPHY, LITERATURE, PHYSICS, SPORTS;

	}
	
	private Profession profession;
	private int score=40;
	public static final int MIN_GRADE=40;
	public static final int MAX_GRADE=100;
	
	
	public Grade() {
		super();
	}
	




	public Grade(Profession profession, int score) {
		super();
		this.profession = profession;
		setScore(score);
	}



	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		if ((score<=MAX_GRADE)&&(score>=MIN_GRADE)) {
		this.score = score;
		}
	}





	@Override
	public String toString() {
		return "Grade [profession=" + profession + ", score=" + score + "]";
	}


	
	
	
	
	
	
	
	
	
	
	

}
