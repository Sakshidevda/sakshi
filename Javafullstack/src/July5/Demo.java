package July5;

public class Demo {
	
	
  static  void add(int a , int b) {
	   int c = a+b;
	   System.out.println(c); 
   }
   
  static void add(int a , int b, int c) {
	   int d = a+b+c;
	   System.out.println(d); 
   }
   
   
  static void add(int...a) {
	   int ans = 0;
	   for(int ff : a) {
		   ans = ans + ff;
	   }
	   System.out.println(ans); 
   }
   
	public static void main(String...args) {
		
		add(12,23);
		
		//System.out.println("normal");
		
		//Demo.main();
		
		//Demo.main("sakshi");
		

	}
	
	

	
	public static void main() {
		
		System.out.println(" i am  no args");
		
}
	
	

}




