package bankingsystem;

import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount("SAV7903", "Karan Kumar", 6000);
        BankAccount current = new CurrentAccount("CUR7890", "Pawan Singh", 2000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(current);

        for(BankAccount account : accounts){
            System.out.println("Processing account for: " + account.getHolderName());
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);
            account.deposit(interest);


            if(account instanceof Loanable){
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan(5000);

                if(loanableAccount.calculateLoanEligibility()){
                    System.out.println("Loan approved for " + account.getHolderName());
                    System.out.println();
                } else{
                    System.out.println("Loan denied for " + account.getHolderName());
                    System.out.println();
                }
            }
        }
    }
}
