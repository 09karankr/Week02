class Book{
  String title;
  String author;
  double price;
  
  Book(String title, String author, double price){
     this.title = title;
	 this.author = author;
	 this.price = price;
  }
  
  void displayDetails(){
     System.out.println("The title of the book is " + title + " and the author is " + author + " and the price of the book is " + price);
  }
}

public class BookInfo{
  public static void main(String[] args){
     Book book = new Book("Java Programming" , "J.shankar" , 1000);
	 book.displayDetails();
  }
}