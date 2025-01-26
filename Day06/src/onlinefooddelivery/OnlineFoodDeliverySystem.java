package onlinefooddelivery;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem vegBurger = new VegItem("Veg Burger", 5.0, 2);
        FoodItem chickenPizza = new NonVegItem("Chicken Pizza", 8.0, 1);

        Discountable discountVeg = (Discountable) vegBurger;
        Discountable discountNonVeg = (Discountable) chickenPizza;

        discountVeg.applyDiscount(10); // 10% discount
        discountNonVeg.applyDiscount(5); // 5% discount

        OrderProcessor.processOrder(vegBurger);
        System.out.println(discountVeg.getDiscountDetails());

        OrderProcessor.processOrder(chickenPizza);
        System.out.println(discountNonVeg.getDiscountDetails());
    }
}
