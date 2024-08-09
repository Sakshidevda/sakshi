package aug03;
import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the number of elements in the array: ");
		 
		 int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.println("Original array:");
	       System.out.println(array);

	        quickSort(array, 0, n - 1);

	        System.out.println("Sorted array:");
	        System.out.println(array);
	    }
	private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
	private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }
	 private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	 private static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}
	


