import java.util.ArrayList;

public class LibraryManagement 
{
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Borrower> borrowers = new ArrayList<>();

    public void addBook(Book book)
     {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addBorrower(Borrower borrower) 
    {
        borrowers.add(borrower);
        System.out.println("Borrower added: " + borrower.getStudentId());
    }

    public Book searchBookByIsbn(String isbn) 
    {
        for (Book b : books)
         {
            if (b.getIsbn().equals(isbn)) 
            {
                return b;
            }
        }
        return null;
    }

    public Borrower searchBorrowerById(String studentId) 
    {
        for (Borrower br : borrowers)
         {
            if (br.getStudentId().equals(studentId))
             {
                return br;
            }
        }
        return null;
    }

    public void displayAllBooks() 
    {
        System.out.println("Library Book List:");
        for (Book book : books) 
        {
            book.displayInfo();
        }
    }
}

