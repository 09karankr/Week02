package LibraryManagement;

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem book = new Book(1, "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine(2, "Tech Today", "Jane Smith");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        Reservable reservableBook = (Reservable) book;
        Reservable reservableMagazine = (Reservable) magazine;
        Reservable reservableDVD = (Reservable) dvd;

        System.out.println(book.getItemDetails() + " - Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + " - Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + " - Loan Duration: " + dvd.getLoanDuration() + " days");

        reservableBook.reserveItem("Alice");
        reservableMagazine.reserveItem("Bob");
        reservableDVD.reserveItem("Charlie");

        System.out.println("Book available: " + reservableBook.checkAvailability());
        System.out.println("Magazine available: " + reservableMagazine.checkAvailability());
        System.out.println("DVD available: " + reservableDVD.checkAvailability());
    }
}
