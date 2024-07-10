package July;

public class Demo {

	public static void main(String[] args) {
		Bank bb = new Bank();
		try {
			bb.WithDraw(10);
		}catch(LowBalanceException e) {
			System.out.println(e);
		}
         System.out.println("sakshi");
	}

}
