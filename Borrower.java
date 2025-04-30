import java.util.ArrayList;
import java.util.List;

public class Borrower 
{
    private String name;
    private String universityId;
    private List<Book> borrowedBooks;

    public Borrower(String name, String universityId) 
    {
        this.name = name;
        this.universityId = universityId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) 
    {
        if (!book.isBorrowed())
         {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " has borrowed \"" + book.title + "\".");
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void returnBook(Book book)
     {
        if (borrowedBooks.contains(book))
         {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " has returned \"" + book.title + "\".");
        }
    }

    public void listBorrowedBooks() 
    {
        System.out.println( + name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) 
        {
            book.displayInfo();
        }
    }

    public String getName() 
    {
        return name;
    }

    public String getUniversityId()
     {
        return universityId;
    }
}
