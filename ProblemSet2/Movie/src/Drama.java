public class Drama extends Movie
{
    public Drama()
    {
        super();
    }

    public Drama(String aRating, int aID, String aTitle)
    {
        super(aRating, aID, aTitle);
    }

    public double calculateLateFees(int days) {
        return 2.0 * days;
    }
}