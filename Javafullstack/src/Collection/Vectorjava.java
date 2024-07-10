package Collection;
import java.util.*;


public class Vectorjava {

	public static void main(String[] args) {
		
		// Create a Vector of integers
		Vector<Integer> vector = new Vector<>();

		// Add elements to the Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Print the original Vector
        System.out.println("Original Vector:");
       System.out.println(vector);
       
    // Remove the element at index 2 (30)
       vector.remove(2);

    // Add a new element 35 at index 2
       vector.add(2, 35);

    // Print the modified Vector
       System.out.println("Modified Vector:");
       System.out.println(vector);
       
       
    // Check if the Vector contains the element 40
       if (vector.contains(40)) {
           System.out.println("Vector contains element 40.");
       } else {
           System.out.println("Vector does not contain element 40.");
       }
       
       // Remove all elements from the Vector
       vector.clear();
       
       
       // Print the final Vector
       System.out.println("Final Vector:");
       System.out.println(vector);
      
     
          for (int i = 0; i < vector.size(); i++) {
              System.out.print(vector.get(i) + " ");
          }
          System.out.println();
      
	
}
  
   }

       
	


