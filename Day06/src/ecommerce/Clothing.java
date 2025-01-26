package ecommerce;

public class Clothing extends Product implements Taxable{
    private double discountRate = 0.20;
    private double taxRate = 0.08;

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount(){
        return  getPrice() * discountRate;
    }

    @Override
    public double calculateTax(){
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails(){
        return "Clothing Tax: 8%";
    }

    @Override
    public  void displayDetails(){
        super.displayDetails();
        System.out.println(getTaxDetails());
    }
}
