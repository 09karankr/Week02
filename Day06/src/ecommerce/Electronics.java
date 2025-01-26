package ecommerce;

 class Electronics extends Product implements Taxable{
    private double discountRate = 0.10;
    private double taxRate = 0.15;

     public Electronics(int productId, String name, double price) {
         super(productId, name, price);
     }

     @Override
     public double calculateDiscount(){
         return getPrice() * discountRate;
     }

     @Override
     public double calculateTax(){
         return  getPrice() * taxRate;
     }
     @Override
     public String getTaxDetails(){
         return "Electronics Tax: 15%";
     }

     @Override
     public void displayDetails(){
         super.displayDetails();
         System.out.println(getTaxDetails());
     }
 }
