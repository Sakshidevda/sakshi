package Collection;
import java.util.*;

public class Demo {
	
		public static void main(String[] args) {
			
			//ArrayList
			
			ArrayList<Integer> arrayList =  new ArrayList <Integer>();
			
			arrayList.add(123);
			arrayList.add(1234);
			arrayList.add(12345);
			
			for(int i = 0; i<arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
			
			
			
		ArrayList<String> array = new ArrayList<>();
		array.add("Khushi");
		array.add("Sakshi");
		array.add("Simran");
		array.add("Pooja");
		array.add("Harshita");
		array.add("Manshi");
		array.add("Rakhi");
		
		
		array.remove(0);
		array.remove("Simran");
		
		
		for(int i = 0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		array.add(3, "Astha");
		

	
		
		
		System.out.println(array.size());
		
		
		
		for(String an : array) {
			System.out.println(an);
		}
		
		
		// Vector
		
		Vector<String> ppp = new Vector <String> ();
		
		ppp.add("Banana");
		ppp.add("papaya");
		ppp.add("Lichi");
		ppp.add("Guvava");
		
		ppp.addAll(array);
		System.out.println("add array with vector");
		
		for(String o : ppp) {
			System.out.println(o);
		}
		
		//stack
		Stack <String> st = new Stack <String> ();
		
		st.add("maths"); //add data by push and add both
		st.add("hindi");
		st.add("soacial study");
		st.add("physics");
		
		st.pop();  //delete karna niche ki
		System.out.println(st.peek());
		st.peek(); // delete karna uper ki
		st.pop();
		
		st.push("english");  // push se add karna
		st.push("Science");
		System.out.println(st);
}
		
		// LinkList
		
}
