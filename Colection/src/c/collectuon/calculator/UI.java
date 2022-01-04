package c.collectuon.calculator;

import java.util.Scanner;

public class UI {

	private Calculator calculator = new Calculator();
	private Scanner sc = new Scanner(System.in);

	public void start() {
			while (true) {
				showMenu();
				System.out.println("enter action (+,-,/,*,=,clear): ");
				String action = sc.nextLine();
				
				switch (action) {
		
				case "+":
					doAdd();
					break;
				case"-":
					break;
				case"/":
					break;
				case"*":
					break;
				case"=":
					break;
				case "clear":
					break;
				default:
					break;
			
				}}
	}
		
		

	public void showMenu() {

		System.out.println("/n ====menu");
		System.out.println("add............+");
		System.out.println("sub............-");
		System.out.println("mul............*");
		System.out.println("div............/");
		System.out.println("res............=");
		System.out.println("clear............clear");

	}

	public void doAdd() {
		System.out.println("enter num: ");
		double val = double.parseDouble(sc.nextLine());
		Calculator.add(val);
		System.out.println("added: "+val);
		}
}
