public class ElecBook extends Book
 {
    private String fileFormat;

    public ElecBook(String title, String author, String isbn, String fileFormat) 
    {
        super(title, author, isbn);
        this.fileFormat = fileFormat;
    }

    @Override
    public void displayInfo()
     {
        System.out.println(" Electronic Book: " + title + " by " + author);
        System.out.println("ISBN: " + isbn + " | Format: " + fileFormat + " | Borrowed: " + isBorrowed);
    }
}
