package library;

import java.util.ArrayList;
import java.util.List;

public class CardHolder {
    private String name;
    private String address;
    private String email;
    private int memberId;
    // private Date dateOfMembership;
    private int totalBooksCheckedout;
    final int MAX_BOOKS_ISSUED_TO_A_USER = 10;

    // public boolean reserveBookItem(Book book);

    // private void incrementTotalBooksCheckedout();

    public CardHolder(int memberId, String name, String address, String email) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getmemberId() {
        return memberId;
    }

    public void setmemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getTotalBooksCheckedout() {
        return totalBooksCheckedout;
    }

    public void setTotalBooksCheckedout(int totalBooksCheckedout) {
        this.totalBooksCheckedout = totalBooksCheckedout;
    }

    public String CardHolderDetails() {
        return "CardHolder: " + " address=" + address + " email=" + email + " id=" + memberId + " name=" + name;
    }

    public boolean checkoutBookItem(Book book) {
        if (this.getTotalBooksCheckedout() >= MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user has already checked-out maximum number of books");
            return false;
        }
        // BookReservation bookReservation =
        // BookReservation.fetchReservationDetails(bookItem.getBarcode());
        // if (bookReservation != null && bookReservation.getMemberId() != this.getId())
        // {
        // // book item has a pending reservation from another user
        // ShowError("This book is reserved by another member");
        // return false;
        // } else if (bookReservation != null) {
        // // book item has a pending reservation from the give member, update it
        // bookReservation.updateStatus(ReservationStatus.COMPLETED);
        // }
        return false;

        // if (!bookItem.checkout(this.getId())) {
        // return false;
        // }

        // this.incrementTotalBooksCheckedout();
        // return true;
    }

}