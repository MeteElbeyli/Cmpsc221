public class Movie
{
    private String rating;
    private int ID;
    private String title;

    public Movie() {
        rating = "";
        ID = 0;
        title = "";
    }

    public Movie(String aRating, int aID, String aTitle) {
        rating = aRating;
        ID = aID;
        title = aTitle;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String aRating) {
        rating = aRating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int aID) {
        ID = aID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public double calculateLateFees(int days) {
        return 2.0 * days;
    }

    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        else if(getClass() != obj.getClass())
            return false;
        else
        {
            Movie other = (Movie)obj;

            return (rating.equals(other.rating) && ID == other.ID
                    && title.equals(other.title));
        }
    }

    public String toString() {
        return "\nMotion Picture Association of America Rating: " + rating + "\nID Number: " + ID
                + "\nMovie Title: " + title;
    }
}