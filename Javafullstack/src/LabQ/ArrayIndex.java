package LabQ;

public class ArrayIndex {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        try {
            // Attempt to access array element at index 5 (which is out of bounds)
            int element = arr[5];
            System.out.println("Element at index 5: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the exception and print an error message
            System.out.println("Error: Array index out of bounds!");
        }
        try {
            // Attempt to access array element at index 2 (which is in bounds)
            int element = arr[2];
            System.out.println("Element at index 2: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This block won't be executed because index 2 is valid
            System.out.println("Error: Array index out of bounds!");
        }
    }


}
