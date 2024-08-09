package july31labq;

public class ThreadA extends Thread{
	
	// ThreadA class extending Thread
	
	private A c;
    private String s;

    public ThreadA(A  c, String s) {
        this.c = c;
        this.s = s;
    }

    @Override
    public void run() {
        c.fun1(s);
    }
	
	

}
