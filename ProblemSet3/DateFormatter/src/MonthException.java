public class MonthException extends Exception
{
    public MonthException()
    {
        super("Invalid month, try again (1-12): ");
    }
    public MonthException(String message)
    {
        super(message);
    }
}
