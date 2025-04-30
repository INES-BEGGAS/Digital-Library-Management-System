public class PhysBook extends Book 
{
    private int pageCount;

    public PhysBook(String title, String author, String isbn, int pageCount) 
    {
        super(title, author, isbn);
        this.pageCount = pageCount;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println(" Physical Book: " + title + " by " + author);
        System.out.println("ISBN: " + isbn + " | Pages: " + pageCount + " | Borrowed: " + isBorrowed);
    }
}
