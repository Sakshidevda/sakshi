package aug08;

public class Example3 {
	
	// instance method refernce
	
	public void normalMethod (int i) {
		System.out.println("running " + i + "km");
	}

	
	
	public static void main(String[] args) {
		Example3 j = new Example3();
		
		Summ kk = j::normalMethod;
		kk.calculation(5);
		
	}
}
