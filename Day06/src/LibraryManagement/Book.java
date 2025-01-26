package LibraryManagement;

public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String borrower;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for books in days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
