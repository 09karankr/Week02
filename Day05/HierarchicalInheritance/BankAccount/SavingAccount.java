package BankAccount;

public class SavingAccount extends BankAccount{
    private double interestRate; // Interest rate in percentage

      public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Added: " + interest + " | New Balance: " + balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}


