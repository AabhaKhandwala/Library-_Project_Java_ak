package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMain {
    public static void main(String[] args) {
        List<LibraryItem> ls = new ArrayList<>();

        // LibraryItem list = new LibraryItem();

        Book bk1 = new GeneralBook(0001, "The Very Hungry Caterpillar", "picture Book", 10, true,
                new Author("Eric Carle"));
        Book bk2 = new ReferenceBook(0002, "Brown Bear Brown Bear", "Picture Book", 7, false, new Author("Eric Carle"));
        Book bk3 = new GeneralBook(0003, "The very busy spider", "Picture Book", 5, true, new Author("Eric Carle"));
        Periodical bk4 = new Magazine(0004, "Food Network Magazine", "weekly");
        Periodical bk5 = new NewsPaper(0005, "The New York Times", "daily");

        Publisher pb = new Publisher();
        pb.setPublisherName("Simon & Schuster");

        ls.add(bk1);
        ls.add(bk2);
        ls.add(bk3);
        ls.add(bk4);
        ls.add(bk5);
        for (LibraryItem i : ls) {
            i.printBookDetails();
        }

        CardHolder c1 = new CardHolder(101, "anna", "abbab st", "abc@abc.com");
        System.out.println("Thanks for Joining: " + c1.CardHolderDetails());

        bk1.checkout(101);
        bk2.checkout(101);

    }

}