package LibraryManagement;

 class Magazine extends LibraryItem implements Reservable {
     private boolean isAvailable = true;
     private String borrower;

     public Magazine(int itemId, String title, String author) {
         super(itemId, title, author);
     }

     @Override
     public int getLoanDuration() {
         return 7; // Loan duration for magazines in days
     }

     @Override
     public void reserveItem(String borrower) {
         if (isAvailable) {
             this.borrower = borrower;
             isAvailable = false;
             System.out.println("Magazine reserved by " + borrower);
         } else {
             System.out.println("Magazine is currently unavailable.");
         }
     }

     @Override
     public boolean checkAvailability() {
         return isAvailable;
     }
}
