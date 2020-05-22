package library;

public class LibraryItemFactory {
    public static LibraryItem createLibraryItem(LibraryItemName name) {
        LibraryItem n = null;
        if (name == null) {
            return null;
        }

        switch (name) {
            case REFERENCE_BOOK:
                n = new ReferenceBook();
                break;
            case GENERAL_BOOK:
                n = new GeneralBook();
                break;
            case MAGAZINE:
                n = new Magazine();
                break;
            case NEWS_PAPER:
                n = new NewsPaper();
                break;
            default:

        }
        return n;
    }
}
