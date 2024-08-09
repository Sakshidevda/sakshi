package july31labq;

public class A {
	
	 //class with fun1() method
	
	public void fun1(String name) {
        System.out.println("Welcome");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(name);
    }

}
