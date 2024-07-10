package Collection;
import java.util.*;
public class ArraylistQ {

	public static void main(String[] args) {
	
		 // create an ArrayList of integers
		 ArrayList<Integer> numbers = new ArrayList<>();

		// add elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);
	        
	     // Print the original ArrayList
	        System.out.println("Original ArrayList:");
	        System.out.println(numbers);

	     // Sort the ArrayList in ascending order
	        Collections.sort(numbers);

	     // Print the sorted ArrayList
	        System.out.println("Sorted ArrayList (ascending order):");
	        System.out.println(numbers);
	        
	     // Reverse the ArrayList
	        Collections.reverse(numbers);
	        
	        //Print the reversed ArrayList
	        System.out.println("Reversed ArrayList:");
	        System.out.println(numbers);
	    }
	}


