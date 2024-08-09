package july23;

public class Common {
	
	public void fun1(String name) {
		System.out.println("welcome");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(name);
		
	}

}
