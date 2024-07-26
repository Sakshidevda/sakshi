package Javacollection;
import java.util.*;

public class Javaarraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String> ();
		list.add("Ram");
		list.add("Shyam");
		list.add("Mohan");
		list.add("Radhe");
		
		Iterator  itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}


