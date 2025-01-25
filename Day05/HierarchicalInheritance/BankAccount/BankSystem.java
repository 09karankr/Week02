package BankAccount;

public class BankSystem {
    public static void main(String[] args) {
        // Creating a savings account
        SavingAccount savings = new SavingAccount("CB60912",500,3.0);
        savings.displayAccountType();
        savings.displayBalance();
        savings.addInterest();
        System.out.println();


        // Creating a checking account
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 1000.0);
        checking.displayAccountType();
        checking.displayBalance();
        checking.withdraw(500);
        checking.withdraw(1500); // Should fail due to limit
        System.out.println();


        // Creating a fixed deposit account
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.0, 12);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayBalance();
        fixedDeposit.displayTermDetails();
    }

}
