public class ProductInventory {
    private String productName;
    private double price;

    // Class variable to track the total number of products
    private static int totalProducts = 0;

    // Constructor to initialize a product and increment totalProducts
    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the ProductInventory class
    public static void main(String[] args) {
        // Creating products
        ProductInventory product1 = new ProductInventory("Lotion", 1200.50);
        ProductInventory product2 = new ProductInventory("Mobile", 799.99);
        ProductInventory product3 = new ProductInventory("Tablet", 499.99);

        // Display details of each product
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\nProduct 3 Details:");
        product3.displayProductDetails();

        // Display total number of products created
        System.out.println("\nTotal Products:");
        ProductInventory.displayTotalProducts();
    }
}
