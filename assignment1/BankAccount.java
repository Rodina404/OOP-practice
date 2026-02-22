public class BankAccount {
    double balance;
    String accountNumber;
    double annualInterestRate;


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

   
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + 
               ", Balance: " + balance + 
               ", Interest Rate: " + annualInterestRate;
    }
}
