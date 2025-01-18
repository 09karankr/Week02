class Book{
  private String title;
  private String author;
  private double price;
     
	 // default constructor
	 Book(){
	   this.title = "Java";
	   this.author = "Raman";
	   this.price = 223;
	 }
	 
	 // parameterized constructor
	 Book(String title, String author, double price){
	  this.title = title;
	  this.author = author;
	  this.price = price;
	} 
	//Getter and setter methods for each attribute
	 public String getTitle(){
	    return title;
	 
	 }
	 public void setTitle(String title){
	     this.title = title;
	 }
	 
	 public String getAuthor(){
	     return author;
	 }
	 public void setAuthor(String author){
	    this.author = author;
	 
	 }
	 public double getPrice(){
	   return price;
	 }
	 
	 public void setPrice(double price){
	    if (price >= 0) { // Ensuring price is not negative
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
	 
	 }
	 public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs " + price);
    }
}
	 
public class BookInfo{
  public static void main(String[] args){
       Book defaultBook = new Book();
        defaultBook.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book paramBook = new Book("Odysey", "Huffman", 15.99);
        paramBook.displayBookDetails();
  
  }
 
}

