package July19;

public class ThreadPriorities extends Thread {

	
	public void run() {
		System.out.println("Inside run method");
	}
	
	
	public static void main(String[] args) {
		
		ThreadPriorities s1 = new ThreadPriorities();
		ThreadPriorities s2 = new ThreadPriorities();
		ThreadPriorities s3 = new ThreadPriorities();
		
		System.out.println("s1 thread priortiy :" + " " + s1.getPriority());
		System.out.println("s2 thread priority :" + " " + s2.getPriority());
		System.out.println("s3 thread priority :" + " " + s3.getPriority());
		
		s1.setPriority(2);
		s2.setPriority(5);
		s3.setPriority(8);
		
		System.out.println("s1 thread priority : " + " " + s1.getPriority());
		System.out.println("s2 thread priority : " + " " +s2.getPriority());
		System.out.println("s3 thread priority : " + " " + s3.getPriority());
		
		
		System.out.println("Currently Executing Thread : " + Thread.currentThread().getName());
		System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
		
		
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority : "+Thread.currentThread().getPriority());

	}

}
