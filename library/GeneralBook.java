package library;

public class GeneralBook extends Book implements Reservable {

    public GeneralBook(int itemId, String title, String genre, int noOfPages, boolean isIssued, Author author) {
        super(itemId, title, genre, noOfPages, isIssued, author);
    }

    @Override
    public void printBookDetails() {
        System.out.println("This is General Book: " + this.getItemId() + " " + this.getTitle() + " " + this.getGenre()
                + " " + this.getAuthor() + " " + this.getPublisherName());
    }

    @Override
    public void checkout() {
        if (!this.isReferenceOnly()) {
            System.out.println("This is reference book,you can issue this.");
        } else {
            System.out.println("This is refernce book,you cann't issue this.");
        }
    }

}