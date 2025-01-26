package onlinefooddelivery;

public class VegItem extends FoodItem implements Discountable{
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice() * (1 - discount / 100);
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage;
        System.out.println("Discount of " + discountPercentage + "% applied to Veg Item.");
    }

    @Override
    public String getDiscountDetails() {
        return "Veg item discount: " + discount + "%";
    }
}

