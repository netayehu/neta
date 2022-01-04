package a.we;

public class Lab9 {

	public static void main(String[] args) {
		int[] randomsArray1 = new int[10];
		int[] randomsArray2 = new int[50];
		int sum=0;
		int sum1=0;
		
		//1-2
		
		for (int i = 0; i < randomsArray1.length; i++) {
			randomsArray1[i] = (int) (Math.random() * 101);
		}
		
		for (int i = 0; i < randomsArray1.length; i++) {
			System.out.println(randomsArray1[i]);
		}
		
		for (int i = 0; i < randomsArray1.length; i++) {
			if (randomsArray1[i]%2==0) {
				sum+=randomsArray1[i];
			}
			if (randomsArray1[i]%2!=0) {
				sum1+=randomsArray1[i];
			}
		}
		System.out.println("sum of even: "+sum +" sum of odd: "+sum1);
		
		//5
		if (sum>sum1) {
			System.out.println("there is more even" +sum);
		}else {
			System.out.println("there is more odd"+sum1);
		}
		
		//6
		
		for (int i = 0; i < randomsArray2.length; i++) {
			randomsArray2[i] = (int) (Math.random() * 101);
		}	

		
		int max=randomsArray2[0];
		int min=randomsArray2[0];
		int index1 = 0;
		int index2 = 0;
		
		for (int i =0; i < randomsArray2.length; i++) {
			if (randomsArray2[i]>max) {
				max=randomsArray2[i];
				index1 =i;
			}
			if (randomsArray2[i]<min) {
				min=randomsArray2[i];
				index2 =i;
			}
		}
		System.out.println(" max = "+max +"index:" +index1);
		System.out.println(" min = "+ min +"index:" +index2);
		
		
		
			
			
			
		

	}

}
