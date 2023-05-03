public class Fraction
{
    private int numerator, denominator;

    public Fraction()
    {
        denominator = 1;
        numerator = 0;
    }

    public Fraction(int inputNumerator)
    {
        numerator = inputNumerator;
        denominator = 1;
    }

    public Fraction(int inputNumerator, int inputDenominator)
    {
        setNumerator(inputNumerator);
        setDenominator(inputDenominator);
    }

    public void setNumerator(int inputNumerator)
    {
        numerator = inputNumerator;
    }

    public void setDenominator(int inputDenominator)
    {
        if(inputDenominator != 0)
            denominator = inputDenominator;
        else
            denominator = 1;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public double getFractionValue()
    {
        return (double)numerator / denominator;
    }

    public String toString()
    {
        reduceFraction();
        return numerator + "/" + denominator;
    }

    public void printFraction()
    {
        reduceFraction();
        System.out.println(numerator + "/" + denominator);
    }

    private void reduceFraction()
    {
        int n = numerator;
        int d = denominator;

        while (n != 0)
        {
            int temp = n;
            n = d % n;
            d = temp;
        }

        numerator = numerator/d;
        denominator = denominator/d;
    }
}
