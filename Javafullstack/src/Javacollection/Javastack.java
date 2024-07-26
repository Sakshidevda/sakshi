package Javacollection;

import java.util.Iterator;
import java.util.*;
import java.util.Iterator;

public class Javastack {

	public static void main(String[] args) {
	
	Stack<Integer> st = new Stack();
	
	st.push(123);
	st.push(456);
	st.push(789);
	st.push(112);
	st.push(223);
	st.push(543);
	
	
	System.out.println(st.peek());
	System.out.println(st.pop());
	
	
	
    for(int i = 0 ; i<st.size(); i++) {
    	System.out.println(st.get(i));
    }
	
	
		
		
		Iterator  itr = st.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			itr.remove();
	}

}
}

