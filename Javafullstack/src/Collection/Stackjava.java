package Collection;
import java.util.*;

public class Stackjava {

	public static void main(String[] args) {
		
		 Stack<Integer> stack = new Stack<>();

	        
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        
	        
	        stack.Check();
	        stack.Clean();
	        
	        
	      
	        
           int poppedElement = stack.pop();
	        System.out.println("Popped element: " + poppedElement);
	        
	       
	        int topElement = stack.peek();
	        System.out.println("Top element: " + topElement);

	        
	        boolean isStackEmpty = stack.isEmpty();
	        System.out.println("Stack is not empty: " + !isStackEmpty);

	        
	        stack.clear();
	        System.out.println("Stack after clearing: " + stack);
	    }
	
	}


