public class YearException extends Exception
{
    public YearException()
    {
        super("Invalid year, try again: ");
    }

    public YearException(String message)
    {
        super(message);
    }
}