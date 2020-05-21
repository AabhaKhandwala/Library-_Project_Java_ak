package library;

public class Book extends LibraryItem {

    private String genre;
    private int noOfPages;
    private boolean isIssued;

    public Book(int itemId, String title, String genre, int noOfPages, boolean isIssued) {
        super(itemId, title);
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.isIssued = isIssued;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

    public void checkIssued() {
        if (this.isIssued()) {
            System.out.println("This is general book,you can issue this.");
        } else {
            System.out.println("This is reference book, you cannot issue it");
        }
    }

}