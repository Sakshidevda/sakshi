package July;

public class BankAccount {
private String accountNumber;
    
    
    private String accountHolderName;
    
   
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
