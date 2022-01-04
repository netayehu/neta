package a.we;

import java.util.Arrays;

public class Lab10 {

	public static void main(String[] args) {
		int[] arr={1,2,3,1,2,3,3,2,1,9,5,1,1,9};
		
		int m1=0;
		int m2=0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
		}
		System.out.println();
		//1
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==1) {
				m1++;
			}
			if (arr[i]==3){
				m2++;
			}
		}
		
		System.out.println("there are "+m1+ " times 1");
		System.out.println("there are "+m2+ " times 3");
		
		
		//2
		int[] arr1=arr;
		int[] arr2 = new int[arr.length];
		int l=0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[i]==arr1[j] && i!=j)  {
					arr1[j]=0;
				}
			}
		}
	
		for (int k = 0; k < arr2.length; k++) {
			if (arr1[k]!=0) {
				arr2[l]=arr1[k];
				l++;
			}
			
		}
	
		System.out.println();
	
		int[] arr31 = new int[l]; 
		
		System.arraycopy(arr2, 0, arr31, 0, l);
		System.out.println(Arrays.toString(arr31));
	
	
		System.out.println("=============");
		
		
		//3
		int[] arr3 = new int[10];
		int[] arr4 = new int[10];
		int j=arr3.length-1;
		System.out.println("arr:");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i]=(int) (Math.random() * 10);
			System.out.print(arr3[i]+ " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < arr3.length; i++) {
			arr4[i]=arr3[j];
			j--;
			
		}
		for (int i = 0; i < arr4.length; i++) {
			
			System.out.print(arr4[i]+ " ");
		}
		
		System.out.println();
		
		//4
		int all=0;
		int avg=0;
		int[][] grades = new int[20][10];
		
		for (int i = 0; i < 20; i++) {
			for (int k = 0; k < 10; k++) {
				grades[i][k]=(int) (Math.random() * 20)+80;	
			}
		}
		
		for (int i = 0; i < 20; i++) {
			avg=0;
			for (int k = 0; k < 10; k++) {
				avg += grades[i][k];
				
			}
			System.out.println("student "+i+" avg is:"+avg/10 );
			all+=avg/10;
		}
		
		System.out.println("general avrage: "+all/20);
		
		
		
		
		
		
			
		

		
		
		
		
		
		
		
		
				
				
			
			
		

	}

}
