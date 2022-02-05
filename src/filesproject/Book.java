//Student name: Olame Akim Muliri
//LSU ID: 898449565
//Lab Section:001
package filesproject;

public class Book extends Publication
{
    private String author;

    public Book(String author, String title, Genre genre, int edition, int year)
    
    {
        super(title, genre, edition, year);
        this.author = author;
    }
    
    @Override
    public String printInfo()
    {
        return super.printInfo() +"\n"+ genre + " book by " + author + super.printFooter();
    }
}
