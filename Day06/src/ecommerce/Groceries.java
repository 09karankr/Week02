package ecommerce;

class Groceries extends Product {
    private double discountRate = 0.05;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double calculateDiscount(){
        return  getPrice() * discountRate;
    }

    public double calculateTax(){
        return 0;
    }
    public  String getTaxDetails(){
        return "No tax on groceries";
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getTaxDetails());
    }

}
