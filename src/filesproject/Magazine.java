//Student name: Olame Akim Muliri
//LSU ID: 898449565
//Lab Section:001
package filesproject;

public class Magazine extends Publication
{
    private String publisher;

    public Magazine(String publisher, String title, Genre genre, int edition, int year)
    {
        super(title, genre, edition, year);
        this.publisher = publisher;
    }
    
    @Override
    public String printInfo()
    {
        return super.printInfo() +"\n"+ genre + " magazine by " + publisher + super.printFooter();
    }
    
    
}
