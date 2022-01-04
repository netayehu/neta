package a;

import b.Box;

public class DemoArr1 {
	
	public static void main(String[] args) {
		
		//int[] arr= new int[5];
		int[] grades= new int[100];
		
		for (int i=0; i<grades.length-1;i++) {
			
			grades[i] = (int) (Math.random()*41)+60;
			System.out.println(grades[i]);
		}
		
		int[]arr1 = {2,4,8};
		for (int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		String[] names = {"Ben","David"};
		for (int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		Box[] boxes = {new Box(),new Box(1,2,1)};
		System.out.println(boxes.length);
		
		System.out.println("================");
		
		String[] modes = {"on","off","stand_by", "sleep"};
		int index = (int) (Math.random() * modes.length);
		System.out.println(modes[index]);
		
		
		
		
		
	}

}
