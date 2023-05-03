public class MoviesTest
{
    public static void main(String[] args) {
        Movie movie =
                new Movie("G", 1243, "Hope *inserted generic childrens movie name :)");
        Action action = new Action("R", 2314, "Doom");
        Comedy comedy = new Comedy("PG-13", 8281, "Blues Clues");
        Drama drama = new Drama("RRR", 3412, "Death Stranding");

        System.out.println(movie);
        System.out.println("Late Fee: $" + movie.calculateLateFees(6));

        System.out.println(action);
        System.out
                .println("Late Fee: $" + action.calculateLateFees(6));

        System.out.println(comedy);
        System.out
                .println("Late Fee: $" + comedy.calculateLateFees(6));

        System.out.println(drama);
        System.out.println("Late Fee: $" + drama.calculateLateFees(6));
    }
}