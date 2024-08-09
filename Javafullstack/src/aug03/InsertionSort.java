package aug03;
import java.util.Scanner;


public class InsertionSort {
	
	public static void insertionSort(int[] array) {
        int n = array.length;
        
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            
            // Move elements of array
            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
	
	
	public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // the array elements
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array:");
        printArray(array);

        // Sorting the array
        insertionSort(array);

        System.out.println("Sorted array:");
        printArray(array);

        
    }
}