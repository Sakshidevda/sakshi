package July18;

public class ThreadBB implements Runnable {
	//Runnable interface is functional interface 
	//Is sepciality single abstarct method (SAM)

	@Override
	public  void run() {
		
		for(int i=0; i<30; i++) {
			System.out.println(i + "second thread");
		}
		

	}
	
	public static void main(String[] args) {
		
		ThreadBB tt = new ThreadBB();
		
		ThreadBB sec = new ThreadBB (tt);
		
		sec.Start();
		
		
		for(int i=30; i<=90; i++) {
			System.out.println(i + "main thread");
	}

}

	
		
	}

