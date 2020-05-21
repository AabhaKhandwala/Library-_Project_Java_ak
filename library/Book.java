package library;

public class Book extends LibraryItem {

    private String genre;
    private int noOfPages;
    private boolean isReferenceOnly;
    private String barcode;
    private BookStatus status;
    private Author author;
    private Publisher publisherName;

    public Book(int itemId, String title, String genre, int noOfPages, boolean isReferenceOnly, Author author) {
        super(itemId, title);
        this.genre = genre;
        this.noOfPages = noOfPages;
        this.isReferenceOnly = isReferenceOnly;
        this.author = author;
        // this.status = status;

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

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setIsReferenceOnly(boolean isReferenceOnly) {
        this.isReferenceOnly = isReferenceOnly;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(Publisher publisherName) {
        this.publisherName = publisherName;
    }

    public boolean checkout(int memberId) {
        if (!this.isReferenceOnly()) {
            System.out.println("This is reference book,you can issue this.");
            return false;
        } else {
            System.out.println("This is refernce book,you cann't issue this.");
            return false;
        }

    }

}