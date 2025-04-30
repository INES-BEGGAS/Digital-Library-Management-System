import java.time.LocalDate;

public class BorrowingProcess
 {
    private Book book;
    private Borrower borrower;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowingProcess(Book book, Borrower borrower) 
    {
        this.book = book;
        this.borrower = borrower;
        this.borrowDate = LocalDate.now();
        this.returnDate = borrowDate.plusDays(14);
    }

    public void displayBorrowingDetails() 
    {
        System.out.println(" Borrowing Process:");
        System.out.println("Book: " + book.title);
        System.out.println("Borrower: " + borrower.getName());
        System.out.println("Borrow Date: " + borrowDate);
        System.out.println("Return Date: " + returnDate);
    }
}
