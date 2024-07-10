package July;

class SavingsAccount extends BankAccount {

   
    private double interestRate;

    
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance); // Call the constructor of the superclass
        this.interestRate = interestRate;
    }

    
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100; 
        deposit(interest); 
        System.out.println("Interest applied: " + interest + ". New balance: " + checkBalance());
    }
    public double getInterestRate() {
        return interestRate;
    }

   
    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Interest rate must be positive.");
        }
    }
}