package Array;

public class Transpose {
	
	
	public static void main(String[] args) {
		int[][] mat = {{0 ,0, 0, 0 }
			           ,{1, 1, 1, 1},
			            {2, 2, 2, 2 }
		};
			
			int [][]arr = new int[mat[0].length][mat.length];
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[0].length;j++) {
					arr[j][i]=mat[i][j];
					
				}
	}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	        
	        
	    }
}


