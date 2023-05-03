import java.util.Scanner;

public class Seating {

    static int filled = 0;

    public static void main(String[] args) {
        char[][] seats = new char[7][4];
        for (int i = 0; i < 7; i++) {
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }

        String seatNum = " ";
        String f = " ";

        System.out.println("Welcome to the Airplane seating organizer.");
        System.out.println("Input the seat you want to reserve. Requires you to enter your seat in the example shown (1A,2B)");
        System.out.println("Enter f to exit program.");

        Scanner keyboard = new Scanner(System.in);
        seatNum = keyboard.nextLine();

        if (seatNum.equals("f"))
        {
            System.out.println("Program Quit. Thank you for considering us!");
            System.exit(0);
        }

        while (filled < 28 && seatNum.length() > 0)
        {
            int row = seatNum.charAt(0) - '1';
            int col = seatNum.charAt(1) - 'A';

            if (row < 0 || row > 7 || col < 0 || col > 4) {
                System.out.println("Error, please input seat or p to quit");
                seatNum = keyboard.nextLine();
                if (seatNum.equals("p")) {
                    System.out.println("Program ended.");
                    System.exit(0);
                }
            } else {
                if (seats[row][col] != 'X') {
                    seats[row][col] = 'X';
                    filled++;
                    System.out.println(" ");
                    printSeats(seats);
                }
                if (filled < 28) {
                    System.out.println("Error, please input seat or p to quit");
                    seatNum = keyboard.nextLine();
                    if (seatNum.equals("p")) {
                        System.out.println("Program ended.");
                        System.exit(0);
                    }
                }
            }
        }
    }

    private static void printSeats(char[][] seats) {
        System.out.println("Row");
        for (int i = 0; i < seats.length; i++) {
            System.out
                    .println((i + 1) + "  " + seats[i][0] + " " + seats[i][1] + "  " + seats[i][2] + " " + seats[i][3]);

        }
        int numberOfSeatsAvailable = (28 - filled);
        System.out.println("There are " + numberOfSeatsAvailable + " seats available.");
    }
}