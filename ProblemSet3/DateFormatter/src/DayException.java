
public class DayException extends Exception
{
    public DayException()
    {
        super("Invalid day, try again (1-31): ");
    }
    public DayException(String message)
    {
        super(message);
    }
}
