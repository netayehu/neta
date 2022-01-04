package a;

public class bord {
	
	public static void main(String[] args) {
		
		
		int n =12;
		int len = 2*n-1;

		int[][] arr = new int[len][len];
		
		
		for (int i=0; i <= n; i++) {
			for (int j=i; j < (len-i); j++) {
				for (int r=i; r<(len-i); r++) {
					arr[j][r]=i+1;
	
				}
			}	
		}
			
	
	
	for (int i=0; i < (len); i++) {
		
		for (int j=0; j < (len); j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}	
		
		
		
		
		
		
		
		
	
	
		
		
		
	
		 
	
	
		
		
		
		
		
	}

}
