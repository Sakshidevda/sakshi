package abstractt;

public class SavingAccount extends BankAccount {

	public static void main(String[] args) {
		
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return balance * interestRate;
	}

}
