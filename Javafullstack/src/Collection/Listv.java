package Collection;
import java.util.*;

public class Listv {

	public static void main(String[] args) {
		
		
Vector<String> vec = new Vector <String> ();
		
		vec.add("Banana");
		vec.add("papaya");
		vec.add("Lichi");
		vec.add("Guvava");
		
		System.out.println(" before removing");
		for(String i : vec) {
			System.out.println(i);
			
		}
			vec.remove(0);
			vec.remove("Banana");
			 System.out.println();
			 System.out.println("after removing");
			 
			 for(String i : vec) {
					System.out.println(i);
			 
			
		
		
		
		
	}

	}
}

