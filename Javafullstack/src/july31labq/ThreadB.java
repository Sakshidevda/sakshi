package july31labq;

public class ThreadB extends Thread {
	
	// ThreadB class extending Thread
	
	private A c;
    private String s;

    public ThreadB(A c, String s) {
        this.c = c;
        this.s = s;
    }

    @Override
    public void run() {
        c.fun1(s);
    }

}
