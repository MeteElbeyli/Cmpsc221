public class Action extends Movie
{
    public Action() {
        super();
    }

    public Action(String aRating, int aID, String aTitle) {
        super(aRating, aID, aTitle);
    }

    public double calculateLateFees(int days) {
        return 3.0 * days;
    }
}