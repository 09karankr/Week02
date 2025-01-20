
class BankAccount{
   private static String bankName = "State bank";
   private static int totalAccounts = 0;
   
   private final int accountNumber;
   
    // Instance variables
    private String accountHolderName;
    private double balance;
	
	BankAccount(String accountHolderName, int accountNumber, double initialBalance){
	      this.accountHolderName = accountHolderName;
		  this.accountNumber = accountNumber;
		  this.balance = initialBalance;
		  
		  totalAccounts++;
	
	}
	public static int getTotalAccounts(){
	     return totalAccounts;
	}

    public double getBalance() {
        return balance;
    }
	 // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object.");
        }
    }
	
        public static void main(String[] args){
     BankAccount account1 = new BankAccount("Alice", 1001, 5000.0);
        BankAccount account2 = new BankAccount("Bob", 1002, 3000.0);

        // Display account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Display total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        

        // Display updated details
        account1.displayAccountDetails();
	
	
}
}

