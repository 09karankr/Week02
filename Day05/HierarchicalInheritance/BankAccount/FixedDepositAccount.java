package BankAccount;

public class FixedDepositAccount extends BankAccount{
    private int depositTerm;


    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }


    public void displayTermDetails() {
        System.out.println("Fixed Deposit Term: " + depositTerm + " months");
    }


    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}


