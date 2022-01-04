package c;

import java.util.Scanner;

public class Targil {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter day:");
		String day = sc.nextLine();
		sc. close();
		
		System.out.println("you enterd:" +day);
		
		int Day;
		Day = (int)(Math.random()*7)+1;
		
		switch(Day) {
		case 3:
			System.out.println("12:30");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		case 1:
		case 2:
		case 4:
		case 5:
			System.out.println("16:30");
			break;
		
		default:
			System.out.println(Day+ "is not a day");
		
		}

	}

}
