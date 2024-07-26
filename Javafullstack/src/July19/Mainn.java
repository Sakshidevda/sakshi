package July19;

public class Mainn {
	
public static void main(String[] args) throws InterruptedException {
		
		A a1 = new A();
	    Thread x = new Thread(a1);
		x.start();
		x.join();
		
		int ss = a1.sum;
		for (int i = 0; i < 30; i++) {
		System.out.println("inside main thread");
		System.out.println(ss);
		}
		}


}
