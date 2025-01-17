class MobilePhone{
   String brand;
   String model;
   double price;
   
   MobilePhone(String brand, String model, double price){
     this.brand = brand;
	 this.model = model;
	 this.price = price;
   }
   void displayDetails(){
      System.out.println("The brand of the mobile phone is " + brand + " and the model is " + model + "and the price of the mobile is " + price);
   }

}

public class MobileDetails{
  public static void main(String[] args){
    MobilePhone mobile = new MobilePhone("Redmi", "Note11" , 15000);
	mobile.displayDetails();
  
  }

}