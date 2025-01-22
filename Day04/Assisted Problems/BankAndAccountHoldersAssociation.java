import java.util.ArrayList;

// Customer class
class Customer {
    private String name;
    private ArrayList<Integer> accountNumbers;

  
    public Customer(String name) {
        this.name = name;
        this.accountNumbers = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(int accountNumber) {
        accountNumbers.add(accountNumber);
    }

    // Method to view all accounts
    public void viewAccounts() {
        System.out.println("Accounts of " + name + ": " + accountNumbers);
    }

    public String getName() {
        return name;
    }
}


class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to add a customer
    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, int accountNumber) {
        customer.addAccount(accountNumber);
        addCustomer(customer);
        System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " at " + name);
    }

    // Method to display all customers
    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}

// Main class to demonstrate the Bank-Customer relationship
public class BankAndAccountHoldersAssociation {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("State Bank of India");

        // Create customers
        Customer customer1 = new Customer("Karan");
        Customer customer2 = new Customer("Nivedita");

        // Open accounts for customers
        bank.openAccount(customer1, 1001);
        bank.openAccount(customer1, 1002);
        bank.openAccount(customer2, 1003);

        
        bank.displayCustomers();

        // View accounts of each customer
        customer1.viewAccounts();
        customer2.viewAccounts();
    }
}
