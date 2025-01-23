import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

   @Override
    public String toString() {
       return name + " ($" + price + ")";
    }
}

class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product product : products) {
            System.out.println("  - " + product);
            total += product.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create a customer
        Customer customer = new Customer("Karan");

        // Create an order
        Order order1 = new Order(1, customer);

        // Add products to the order
        order1.addProduct(product1);
        order1.addProduct(product3);

        
        customer.placeOrder(order1);

        // Create another order
        Order order2 = new Order(2, customer);
        order2.addProduct(product2);

        
        customer.placeOrder(order2);

        // Display orders
        System.out.println("Orders placed by " + customer.getName() + ":");
        for (Order order : customer.getOrders()) {
            order.displayOrderDetails();
            System.out.println();
        }
    }
}
