class Book{
   private static String libraryName = "HolyLibHouse";
   private String title;
   private String author;
   private final String isbn;
   
   
   Book(String title, String author, String isbn){
      this.title = title;
	  this.author = author;
	  this.isbn = isbn;
	}
   public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
   
   public void displayBookDetails(){
        if(this instanceof Book){
		   System.out.println("Library name: " + libraryName);
		   //System.out.println("Book Name: " + bookName);
		   System.out.println("Title of the book: " + title);
		   System.out.println("Author of the book: " + author);
		   
		} else{
			 System.out.println("Object is not an instance of Book class.");
        }
			
		}
		
   public String getIsbn() {
        return isbn;
    }
	
	public static void setLibraryName(String name) {
        libraryName = name;
    }
   
      public static void main(String[] args){
	   
	  //Book.displayLibraryName();
      Book Kitab = new Book("Crazy in the sea", "Sudhakar singh", "12");
	  Book Kitab2 = new Book("Crazy on the land", "Nivedita", "13");
	  
	  Kitab.displayBookDetails();
	  Kitab2.displayBookDetails();
	  
	  // Change library name and display it again
      Book.setLibraryName("Downtown Library");
      Book.displayLibraryName();
   
   }
  }
  


