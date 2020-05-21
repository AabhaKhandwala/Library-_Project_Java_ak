package library;

public class Magazine extends Periodical {

    public Magazine(int itemId, String title, String releaseDate) {
        super(itemId, title, releaseDate);
    }

    @Override
    public void printBookDetails() {
        System.out.println(this.getItemId() + " " + this.getTitle() + " " + this.getReleaseDate());
    }

}