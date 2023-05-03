import java.util.*;

public class Main
{
    public static int maximumDay(int monthNumber)
    {
        switch(monthNumber)
        {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    public static int readMonthNumber() throws MonthException
    {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.println("Enter Month Number:");
        try
        {
            month = input.nextInt();
            if(month <= 0 || month > 12)
                throw new MonthException();
        }
        // Month range defined

        catch(InputMismatchException e)
        {
            throw new MonthException();
        }
        return month;
    }
    public static int readDayNumber(int month) throws DayException
    {
        Scanner input = new Scanner(System.in);
        int day;
        System.out.println("Enter day number:");
        try
        {
            day = input.nextInt();
            if(month != 2 && (day <= 0 || day > maximumDay(month)))
                throw new DayException();
        }

        catch(InputMismatchException e)
        {
            throw new DayException();
        }
        return day;
    }
    public static int readYearNumber() throws YearException
    {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter year number:");
        try
        {
            year = input.nextInt();
            if(year <= 1000 || year > 3000)
                throw new YearException();
        }
        // year range
        catch(InputMismatchException e)
        {
            throw new YearException();
        }
        return year;
    }
    public static int checkFebruary(int day, int year) throws DayException
    {
        int maxDay = maximumDay(2);
        if(year % 4 == 0)
            maxDay++;
        if(day <= 0 || day > maxDay)
        {
            throw new DayException();
        }
        else
            return day;
    }

    public static String monthString(int monthNumber)
    {
        switch(monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Error, !!!!!!!!!!!!");
                System.exit(0);
                return "Error";
        }
    }

    public static void main(String args[])
    {
        int month = 1, day = 1, year = 1000;
        boolean gotMonth = false;
        while(!gotMonth)
        {
            try
            {
                month = readMonthNumber();
                gotMonth = true;
            }
            catch (MonthException e)
            {
                System.out.println(e.getMessage());
            }
        }
        boolean gotDay = false;
        while(!gotDay)
        {
            try
            {
                day = readDayNumber(month);
                gotDay = true;
            }
            catch (DayException e)
            {
                System.out.println(e.getMessage());
            }
        }
        boolean gotYear = false;
        while(!gotYear)
        {
            try
            {
                year = readYearNumber();
                gotYear = true;
            }
            catch (YearException e)
            {
                System.out.println(e.getMessage());
            }
        }
        
        System.out.println("The date is " + monthString(month) + " " + day +", " + year);
    }
}





