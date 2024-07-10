package Finallkeyword;

public class Constant {
	
	public static final double PI = 3.14519; 

	public final double calculateArea(double radius) {
		return PI * radius * radius;
		
		
	}
	public static void main(String[]args) {
		Constant c = new Constant();
		
		double s = c.calculateArea(3.5);
		System.out.println(s);
	}

}
