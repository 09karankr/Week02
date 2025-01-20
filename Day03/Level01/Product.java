class Product{
    private static double discount;
	private static String productName;
	private double price;
	private int quantity;
	private final int productID = 1;
	private static double updateDiscount;
	
	Product(String productName, double price, int quantity){
	  this.productName = productName;
	  this.price = price;
	  this.quantity = quantity;
	  updateDiscount++;
	}
	
	public int getProductId(){
	   return productID;
	} 
	
	private static void displayUpdatedDiscount(){
	    System.out.println("Updated discount:" + updateDiscount);
		updateDiscount++;
	
	}
	public static void displayProductName(){
       System.out.println("Product Name: " + productName);
	   
 }
 
 public static void setProductName(String name) {
       productName = name;
    }
	
	public void displayProductDetails(){
        if(this instanceof Product){
		   System.out.println("Product name: " + productName);
		   System.out.println("Product price: " + price);
		   System.out.println("Quantity of the product: " + quantity);
		   //System.out.println("Author of the book: " + author);
		   System.out.println("Product id: " + productID);
		   //System.out.println("Total discount: " + displayUpdatedDiscount);
		} else{
			 System.out.println("Object is not an instance of Employee class.");
        }
			
		}
  public static void main(String[] args){
     Product p1 = new Product("Lays", 52.2, 2);
	 Product p2 = new Product("Kurkure",25.0,3);
	 
	 p1.displayProductDetails();
	 p2.displayProductDetails();
	 
	 Product.displayUpdatedDiscount();
  
  }

}