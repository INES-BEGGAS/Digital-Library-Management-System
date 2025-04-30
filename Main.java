import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) 
    {
        LibraryManagement library = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        //  data
        Book b1 = new PhysBook("Pride and Prejudice", "Jane Austen", "987654", "paperback");
        Book b1 = new PhysBook("Our Second Life Begins When You Realize You Only Have One", "Raphaëlle Giordano", "7891011", "paperback");

        library.addBook(b1);
        library.addBook(b2);

        Borrower borrower = new Borrower("Ines", "2025001");
        library.addBorrower(borrower);

        //  interaction
        System.out.println("Borrowing 'Our Second Life Begins When You Realize You Only Have One'...");
        borrower.borrowBook(b1);

        System.out.println("\nListing borrowed books:");
        borrower.listBorrowedBooks();

        System.out.println("\nReturning book...");
        borrower.returnBook(b1);

        System.out.println("\nAll books in library:");
        library.displayAllBooks();

        scanner.close();
    }
}
