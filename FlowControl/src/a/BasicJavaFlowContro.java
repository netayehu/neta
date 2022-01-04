package a;

import java.util.Arrays;

public class BasicJavaFlowContro {

	public static void main(String[] args) {

		// 1

		int[] nums1 = new int[15];
		int[] nums2 = new int[15];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
		}

		// 2
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));

		// 3
		int a;
		int b;
		int c;
		int num;
		int max = 0;

		for (int i = 0; i < nums1.length - 2; i++) {

			a = nums1[i];
			b = nums1[i + 1];
			c = nums1[i + 2];
			num = a * 100 + b * 10 + c;
			if (max < num) {
				max = num;
			}
		}
		System.out.println("max num: " + max);

		for (int i = nums1.length - 1; i > 2; i--) {

			a = nums1[i];
			b = nums1[i - 1];
			c = nums1[i - 2];
			num = a * 100 + b * 10 + c;
			if (max < num) {
				max = num;
			}
		}
		System.out.println("max num from both sides : " + max);
		

		// 4

		int[] distinct = new int[10];

		for (int i = 0; i < distinct.length; i++) {
			distinct[i] = -1;
		}
		// System.out.println(Arrays.toString(distinct));

		int x = 0;
		int y = 0;
		int l = 0;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j] == i) {
					x++;
				}
				if (nums2[j] == i) {
					y++;
				}
			}
			if (((x == 0) && (y != 0)) || ((y == 0) && (x != 0))) {
				distinct[l] = i;
				l++;
			}
			x = 0;
			y = 0;
		}

		// 5
		System.out.println(Arrays.toString(distinct));

		// 6
		l = 0;
		num = 0;

		for (int i = 0; i < distinct.length; i++) {
			if (distinct[i] != -1) {
				num = num * 10 + distinct[i];
			}
		}
		
		if(distinct[0]==0) {
			num *=  10;
		}

		System.out.println("number: " + num);

	}

}

	
