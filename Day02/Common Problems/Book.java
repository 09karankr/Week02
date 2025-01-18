public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized constructor
    public Book(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book: " + title);
            return true;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a book using the parameterized constructor
        Book book1 = new Book("C programming", "F. Scott", 10.99, true);
        System.out.println("Book Details:");
        book1.displayBookDetails();

        // Borrowing the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\nBook Details After Borrowing:");
        book1.displayBookDetails();

        // Trying to borrow the same book again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();
    }
}
