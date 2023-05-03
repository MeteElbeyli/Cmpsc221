import java.sql.SQLOutput;

public class FractionDemo extends Fraction {
    public static void main(String[] args) {

        Fraction frac1 = new Fraction(20, 60);
        Fraction frac2 = new Fraction(240,180);
        Fraction frac3 = new Fraction(140, 250);
        Fraction frac4 = new Fraction(25, 100);
        Fraction frac5 = new Fraction(30, 240);

        System.out.println("Fraction #1: " + frac1);
        System.out.println("Fraction #2: " + frac2);
        System.out.println("Fraction #3: " + frac3);
        System.out.println("Fraction #4 "  + frac4);
        System.out.println("Fraction #5 "  + frac4);

    }
}
