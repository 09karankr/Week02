package onlinefooddelivery;

public class OrderProcessor {
    public static void processOrder(FoodItem item) {
        System.out.println(item.getItemDetails());
        System.out.println("Total Price: $" + item.calculateTotalPrice());
    }
}
