package Collection;
import java.util.*;

public class Arraylist {
	
	public static void main(String[]args) {
	
	ArrayList<String> array = new ArrayList<>();
	array.add("Khushi");
	array.add("Sakshi");
	array.add("Simran");
	array.add("Pooja");
	array.add("Harshita");
	array.add("Manshi");
	array.add("Rakhi");
	
	System.out.println(" before removing");
	for(String i : array) {
		System.out.println(i);
		
	}
	array.remove(0);
	array.remove("Simran");
	 System.out.println();
	 System.out.println("after removing");
	 
	 for(String i : array) {
		 System.out.println(i);
	 }

}
}
