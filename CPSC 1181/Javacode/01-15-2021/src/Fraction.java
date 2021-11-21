/*Student Name: Edward Lu
 *Student Number: 100359822
 *Date Written: January 15, 2021
 *JDK Version: 14
 *Purpose: This program will create a Fraction Class that can add, multiply, and subtract.*/

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction ()
    {
        numerator = 0;
        denominator = 1;
    }

    public Fraction (int newNum, int newDenom)
    {
        numerator = newNum;
        denominator = newDenom;
    }

    public Fraction add(Fraction frac)
    {
        int tempNum,
                tempDenom;

        tempNum = numerator * frac.denominator +
                frac.numerator * denominator;

        tempDenom = denominator * frac.denominator;

        Fraction result = new Fraction(tempNum, tempDenom);

        return result;
    }

    public Fraction subtract(Fraction frac)
    {
        int tempNum,
                tempDenom;

        tempNum = numerator * frac.denominator -
                frac.numerator * denominator;

        tempDenom = denominator * frac.denominator;

        Fraction result = new Fraction(tempNum, tempDenom);

        return result;
    }

    public Fraction multiply(Fraction frac)
    {
        int tempNum,
                tempDenom;

        tempNum = numerator * frac.numerator;

        tempDenom = denominator * frac.denominator;

        Fraction result = new Fraction(tempNum, tempDenom);

        return result;
    }

    @Override
    public String toString()
    {

        return (numerator + "/" + denominator);

    }
}
