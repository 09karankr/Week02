package LibraryManagement;

public class DVD extends LibraryItem implements Reservable{
    private boolean isAvailable = true;
    private String borrower;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for DVDs in days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable) {
            this.borrower = borrower;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD is currently unavailable.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}
