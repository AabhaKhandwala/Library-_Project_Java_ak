package library;

public class Periodical extends LibraryItem {
    private String releaseDate;

    public Periodical(int itemId, String title, String releaseDate) {
        super(itemId, title);
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
