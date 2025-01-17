import java.util.Scanner;
  
class Item {
    
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class ItemDetails{
	public static void main(String[] args) {
        // Example usage
        Item item = new Item(101, "Laptop", 799.99);

        // Display item details
        item.displayDetails();

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: $" + totalCost);
		sc.close();
    }

	
}


  
