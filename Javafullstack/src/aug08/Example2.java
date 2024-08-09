package aug08;

public class Example2 {
	
	public static void notLikeRun () {
		
		System.out.println("Thread is working.....");
	}
	
	public static void main(String[] args) {
		// static method refernce
		Thread t1 = new Thread(Example2 :: notLikeRun);
		t1.start();
	}

}
