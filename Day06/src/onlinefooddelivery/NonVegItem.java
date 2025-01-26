package onlinefooddelivery;

public class NonVegItem extends FoodItem implements Discountable{
    private double discount;
    private final double nonVegSurcharge = 1.15; // 15% surcharge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() * nonVegSurcharge * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
        System.out.println("Discount of " + discountPercentage + "% applied to Non-Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg item discount: " + discount + "%";
    }
    }

