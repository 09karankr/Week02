package bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;
    private static final double OVERDRAFT_LIMIT = 1000;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public  double calculateInterest(){
        return getBalance() * INTEREST_RATE;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current account loan application submitted for: $" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() + OVERDRAFT_LIMIT >= 3000;
    }
}
