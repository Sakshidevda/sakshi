package July;

public class Bank {
	int amount = 500;

	public  void WithDraw(int payment)throws LowBalanceException {
		if (amount<=500) {
			throw new LowBalanceException("your amount is too low");
		}else {
			amount = amount - payment;
			System.out.println("this is your payment kindly recive");
		}
		

	}
	
	public int deposite(int paisa) throws ToMuchAmountException {
		if (paisa > 100000) {
			throw new ToMuchAmountException("you have to go bank manually ");
			
		}
		
		amount  = amount + paisa ;
		
		return amount ;
		
	}

}
