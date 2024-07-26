package july10;

import java.util.*;

public class StringSplit {

	public static void main(String[] args) {
		
		
		String s = "Hello World Java Program";
		
		String arr [] = s.split(" ");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
	 for(int i =0 ; i<arr.length; i++ ) {
		 String reverse = "";
		 
		
		 
		 for(int j = arr[i].length()-1; j>=0; j--) {
			
			 reverse = reverse+arr[i].charAt(j);
		 }
		 System.out.println();
		 
	      s += s.charAt(i);
		 
		  System.out.println( reverse + " ");
	 }
	        
	
	    	 
	    	
	     
		
		
		
		
		
		
	    	
		       
	}
}
	
	


