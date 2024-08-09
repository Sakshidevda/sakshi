package aug03;
import java.util.*;

public class MatrixAddition {
	
	public static void main(String[] args) {
		
		
		//  matrix dimensions from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for matrices: ");
        
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for matrices: ");
       
        int cols = scanner.nextInt();
        
        
     // Create 2D arrays for matrices
        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];
        Integer[][] resultMatrix = new Integer[rows][cols];


        
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements for Matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
       // matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
     
        System.out.println("Result Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
	}

}
