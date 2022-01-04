package c;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
//		String mode = "off";
		String mode = "on";
//		String mode = "stand by";
		
		
		switch(mode) {
		case "off":
			System.out.println("machine off");
			break;
		case "on":
			System.out.println("machine on");
			break;
		case "stand by":
			System.out.println("machine stand by");
			break;
		
		}

	}

}
