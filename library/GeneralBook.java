package library;

public class GeneralBook extends Book implements Reservable, Loanable {

    public GeneralBook() {

    }

    public GeneralBook(int itemId, String title, String genre, int noOfPages, boolean isIssued, Author author) {
        super(itemId, title, genre, noOfPages, isIssued, author);
    }

    @Override
    public void printBookDetails() {
        System.out.println("This is General Book: " + this.getItemId() + " " + this.getTitle() + " " + this.getGenre()
                + " " + this.getAuthor() + " " + this.getPublisher().getPublisherName());
    }

    @Override
    public void checkout() {
        if (!this.isReferenceOnly()) {
            System.out.println("This is reference book,you can issue this.");
        } else {
            System.out.println("This is refernce book,you cann't issue this.");
        }
    }

    @Override
    public void lateCharges(LoanableFrequency frequency) {
        switch (frequency) {

            case DAILY:
                System.out.println("fine will be charged daily");
                break;
            case WEEKLY:
                System.out.println("fine will be charged after  a week");
                ;
                break;
            case BI_WEEKLY:
                System.out.println("fine will be charged bi- weekly");
                ;
                break;
            case MONTHLY:
                System.out.println("fine will be charged after  a month");
                break;
            default:

        }

    }

}