package lab7;
import java.io.*;
import java.util.Arrays;

public class Calculator {
	
	public static void main(String args[]) {
        int x, y, z;
      
        x = 2 ;
        y = 3;
        z = x + y;
        System.out.println("calculateSum(2, 3) should return = " + z );
    
	
    
	 
	 double d1 = 1.2;
	 double d2 = 2.3;
	 double d3 = 3.4;
	 double d = d1 + d2 + d3 ;
	 System.out.println("calculateSum(1.2, 2.3, 3.4) should return = "+ d);
	 
	 
	 int [] arr = new int[] {1,2,3,4,5};
     int sum = Arrays.stream(arr).sum();
     System.out.println("calculateSum(new int[] {1, 2, 3, 4, 5}) should return = " + sum );
	 		
}
}
 
