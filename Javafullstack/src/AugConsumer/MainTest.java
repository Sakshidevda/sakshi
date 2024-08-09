package AugConsumer;

import java.util.function.Consumer;

public class MainTest {

	public static void main(String[] args) {
		

      Consumer<String> consumer1 = new ConsumerIml ();
		
		consumer1.accept("Raavan");
	
	
	//ThreadA oo = new ThreadA();
	//Thread cc =new  Thread();
	//cc.start();
		
		
		Runnable a = new Runnable() {
			public void run() {
				System.out.println("I am runnable");
			  }
			
			Thread t1 = new Thread(a);
			t1.start();
		   };
	   }
}

