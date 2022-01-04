package b.app;

import java.util.Arrays;

public class ArraysFlowControl {

	public static void main(String[] args) {

		int[] arr1 = new int[25];
		int[] arr2 = new int[25];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);

		}

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 10);
		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int maxNum = 0;
		int maxNum2 = 0;
		int x = 0;
		int x2 = 0;
		int[] arr11 = new int[10];
		int[] arr22 = new int[10];

		for (int i = 0; i <= 9; i++) {
			x = i;
			x2 = i;
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] == i) {
					x = x * 10 + i;
				}
				if (arr2[j] == i) {
					x2 = x2 * 10 + i;
				}
			arr11[i]=x;
			arr22[i]=x2;
			}
			if (maxNum < x) {
				maxNum = x;
			}
			if (maxNum2 < x2) {
				maxNum2 = x2;
			}
		}
		System.out.println();
		System.out.println("arr1 max: " + maxNum);
		System.out.println("arr2 max: " + maxNum2);
		System.out.println(Arrays.toString(arr11));
		System.out.println(Arrays.toString(arr22));
		

		// ==========================================
		// 4

		int[] arr33 = new int[20];
		System.arraycopy(arr11, 0, arr33, 0, 10);
		System.arraycopy(arr22, 0, arr33, 10, 10);
		System.out.println(Arrays.toString(arr33));
		
		
		
		int[] arr3 = new int[5];


		for (int k = 3; k < arr3.length; k++) {
			
			
		

		}
		
		
		
		
		//7
		int y=0;
		for (int j = 0; j < arr3.length; j++) {
			if ((arr1[j]%2)!=0) {
				
				
			}
			
			
			
		}
		

	}

}
