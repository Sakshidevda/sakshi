package aug08;

public class Testing {
	
	public static void main(String[] args) {
		
		Summ obj = new Summ() {
		@Override 
	    public void calculation(int s) {
				}
		};
		
		Summ ob = s -> System.out.println(s*s); // lamda experssion
		ob.calculation(8);
		
		
		// Static Method Refernce
		
		Summ obj3 = DifferentClass  :: doingSomething; // static reference
		
		obj3.calculation(4);
	}

}
