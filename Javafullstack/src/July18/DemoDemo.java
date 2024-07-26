package July18;

public class DemoDemo {

	public static void main(String[] args) {
		
		X x1 = new X ();
		
		//x1.run();  //single thread hi hai abhi ye
		
		x1.start();
		
		for(int i=30; i<=90; i++) {
			System.out.println(i + "main thread");
		}
	}

}
