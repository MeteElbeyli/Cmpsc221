import java.util.*;
//BowlingPinsDemo.java
public class Bowling
{
    public static void recursionPins(int n, int t)
    {
        if (n == 1)
        {
            System.out.print("\t\t");
            for (int i = 1; i <= t - 1; i++)
                System.out.print(" ");

            System.out.println("*");
        }
        else
        {
            System.out.print("\t\t");
            recursionPins(n - 1, t);
            for (int i = 1; i <= t - n; i++)
                System.out.print(" ");

            for (int i = 1; i <= n; i++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // main method
    public static void main(String args[])
    {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter number of rows of pins: ");
        int n = input.nextInt();
        recursionPins(n, n);
    }
}