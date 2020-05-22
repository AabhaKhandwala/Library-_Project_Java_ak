package library;

public class ReferenceBook extends Book implements Reservable {
    public ReferenceBook() {

    }

    public ReferenceBook(int itemId, String title, String genre, int noOfPages, boolean isIssued, Author author) {
        super(itemId, title, genre, noOfPages, isIssued, author);
    }

    @Override
    public void printBookDetails() {
        System.out.println("This is Reference Book: " + this.getItemId() + " " + this.getTitle() + " " + this.getGenre()
                + " " + this.getAuthor() + " " + this.getPublisher().getPublisherName());
    }

    @Override
    public void checkout() {
        System.out.println("This is refernce only books!!");
    }

}
