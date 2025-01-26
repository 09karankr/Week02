package LibraryManagement;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;


    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }



}
