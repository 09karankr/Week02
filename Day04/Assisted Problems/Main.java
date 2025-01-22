import java.util.ArrayList;


class Book {
    private String title;
    private String author;

  
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method for display
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book> books;

    
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Great landscapes", "Rahul Meena");
        Book book2 = new Book("1984", "Harsh tandon");
        Book book3 = new Book("To pass by", "Harsh rajpoot");

        // Create Library objects
        Library library1 = new Library("Housing Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book1); 

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();

        // Show that books exist independently
        System.out.println("\nIndependent Book: " + book1);
    }
}
