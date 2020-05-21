package library;

public class LibraryItem {
    private int itemId;
    private String title;

    public LibraryItem() {

    }

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printBookDetails() {
        System.out.print(itemId + " " + title);
    }

}