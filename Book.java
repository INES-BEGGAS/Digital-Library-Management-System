public abstract class Book
 {
    protected String title;
    protected String author;
    protected String isbn;
    protected boolean isBorrowed;

    public Book(String title, String author, String isbn) 
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public abstract void displayInfo();

    public void borrow()
     {
        isBorrowed = true;
    }

    public void returnBook()
     {
        isBorrowed = false;
    }

    public boolean isBorrowed() 
    {
        return isBorrowed;
    }

    public String getIsbn() 
    {
        return isbn;
    }
}
