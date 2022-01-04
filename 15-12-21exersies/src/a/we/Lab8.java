package a.we;

public class Lab8 {

	public static void main(String[] args) {
		//1
		int[] randomsArray = new int[10];
		int sum=0;
		
		
		
		for (int i = 0; i < randomsArray.length; i++) {
			randomsArray[i] = (int) (Math.random() * 101);
		}
		
		for (int i = 0; i < randomsArray.length; i++) {
			System.out.println(randomsArray[i]);
			
		}
		//2
		for (int i = 0; i < randomsArray.length; i++) {
			System.out.print(randomsArray[i]+" ");
		}
		System.out.println();	
		
		
		//3+4
		for (int i = 0; i < randomsArray.length; i++) {
			sum += randomsArray[i];
		}
		System.out.println("sum: "+sum+ " average: "+ sum/randomsArray.length);
		//5-8
		int max=randomsArray[0];
		int min=randomsArray[0];
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < randomsArray.length; i++) {
			if (randomsArray[i]>max) {
				max=randomsArray[i];
				index1 =i;
			}
			if (randomsArray[i]<min) {
				min=randomsArray[i];
				index2 =i;
			}
		}
		System.out.println(" max = "+max+" min = "+ min);

		
		

	}

}
