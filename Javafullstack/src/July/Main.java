package July;

public class Main {
	public static void main(String[] args) {
        
        BankAccount account = new BankAccount("123456789", "Henri Lionel", 1000.0);
		System.out.println("Current balance: " + account.checkBalance()); 
        account.deposit(4000.0);
        account.withdraw(3000.0); 
        System.out.println("Current balance: " + account.checkBalance()); 

       
        SavingsAccount savings = new SavingsAccount("888888888", "Amphitrite Jun", 2000.0, 5.0);
        savings.applyInterest(); // Apply interest
        System.out.println("Savings account balance: " + savings.checkBalance()); 
    }
}


