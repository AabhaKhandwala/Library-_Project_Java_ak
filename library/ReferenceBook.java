package library;

public class ReferenceBook extends Book {

    public ReferenceBook(int itemId, String title, String genre, int noOfPages, boolean isIssued) {
        super(itemId, title, genre, noOfPages, isIssued);
    }

    @Override
    public void printBookDetails() {
        System.out.println(this.getItemId() + " " + this.getTitle() + " " + this.getGenre());
    }

}
