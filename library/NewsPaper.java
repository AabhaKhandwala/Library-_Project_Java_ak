package library;

public class NewsPaper extends Periodical {

    public NewsPaper(int itemId, String title, String releaseDate) {
        super(itemId, title, releaseDate);
    }

    @Override
    public void printBookDetails() {
        System.out.println(
                "This is NewsPaper: " + this.getItemId() + " " + this.getTitle() + " " + this.getReleaseDate());
    }

}