package July;

import java.util.Scanner;

public class Exception {
	
	
	
	

	

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a");
		
		int a = sc.nextInt();
		
		System.out.println("enter value of b");
		
		int b = sc.nextInt();
		
		int c = a/b;
		
		System.out.println("Output of a/b: " + c);
		
		
	
	int[] arr = new int[5];
	arr[0] = 2;
	arr[1] = 3;
	arr[2] = 21;
	arr[3] = 33;
	arr[4] = 26;
	try {
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		
	System.out.println(arr[7]);
	System.out.println("normal flow");
	
	String s = "2323";
	int iii = Integer.parseInt(s);
	System.out.println(iii);
	  }
  
	
    }
}
 


	