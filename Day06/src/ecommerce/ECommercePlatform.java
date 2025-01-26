package ecommerce;

import java.util.ArrayList;

public class ECommercePlatform {
    public static void printFinalPrice(Product product){
        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("-------------------------");
        product.displayDetails();
        System.out.println("Discount Applied: " + discount);
        System.out.println("Tax Applied: " + tax);
        System.out.println("Final Price: " + finalPrice);
    }
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 1200));
        products.add(new Clothing(102, "T-Shirt", 50));
        products.add(new Groceries(103, "Milk", 5));

        for(Product product: products){
            printFinalPrice(product);
        }
    }
}
