package Collection;
import java.util.*;

public class Fruit {
	
	public static void main(String[]args) {
		
		ArrayList<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        
        System.out.println("Original ArrayList:");
         System.out.println(fruits);
        
        fruits.remove(2);

        // Add "Fig" at index 2
        fruits.add(2, "Fig");

        // Print the modified ArrayList
        System.out.println("Modified ArrayList:");
        System.out.println(fruits);
        
        if (fruits.contains("Banana")) {
            System.out.println("ArrayList contains 'Banana'.");
        } else {
            System.out.println("ArrayList does not contain 'Banana'.");
        }

        // Remove all elements from ArrayList
        fruits.clear();

        // Print the final ArrayList
        System.out.println("Final ArrayList:");
        System.out.println(fruits);
    

    
   
        for (String element : fruits) {
            System.out.println(element);
        }
    }

	}


