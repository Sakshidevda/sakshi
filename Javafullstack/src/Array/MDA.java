package Array;

public class MDA {

	public static void main(String[] args) {
		int[][]mat = {{2,3,5},
				          {6,78,2},
				          {2,4,8}};
		
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]%2=0) {
					
				}
				
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

		
		
	}

}
