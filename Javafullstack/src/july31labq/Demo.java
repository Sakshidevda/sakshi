package july31labq;

public class Demo {
	
	// Demo class to test the threads
	
	public static void main(String[] args) {
       A tt = new A();

        ThreadA threadA = new ThreadA(tt, "Thread A");
        ThreadB threadB = new ThreadB(tt, "Thread B");

        threadA.start();
        threadB.start();
    }

}
