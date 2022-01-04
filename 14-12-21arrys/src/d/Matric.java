package d;

public class Matric {

	public static void main(String[] args) {

		int[][] matrix = new int[4][3];
		matrix[0][0] = 5;
		matrix[3][2] = 3;
		
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
				
			}
			System.out.println();
			
		}
		// static initialization
		
		int[][] matrix1 = {{1,1,1},{2,2},{3,3,3,3}};
		
		for (int i=0;i<matrix1.length;i++) {
			for (int j=0;j<matrix1[i].length;j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
		
		// dynamic initialization
		
		

	}

}
