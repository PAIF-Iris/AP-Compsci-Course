/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction()
    {
        numerator = 0;
        denominator = 1;
    }
    
    public Fraction(int top, int bottom){
        if (bottom == 0){
            System.out.println ("denominator cannot be zero");
            denominator = 1;
            numerator = top;
        } else{
            numerator = top;
            denominator = bottom;
        }
    }
    
    public Fraction(String fraction){
        int x = fraction.indexOf("/");
        if (0 == Integer.parseInt(fraction.substring(x+1))){
            System.out.println ("denominator cannot be zero");
            denominator = 1;
        } else{
            denominator = Integer.parseInt(fraction.substring(x+1));
        }
        numerator = Integer.parseInt(fraction.substring(0, x));
    }
    
    public Fraction(Fraction fraction1){
        numerator = fraction1.numerator;
        denominator = fraction1.denominator;
    }

    public int getNum()
    {
        return numerator;
    }
    
    public int getDen()
    {
        return denominator;
    }
    
    public void setNum(int num){
        numerator = num;
    }
    
    public void setDen(int den){
        if (denominator == 0){
            System.out.println("denominator cannot equal zero");
        } else{
            denominator = den;
        }
    }
    
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    public double toDouble(){
        return (double)numerator/denominator;
    }
    
    private int GreatestCommonFactor(int number1, int number2){        
        while (number1 != number2){
            if (number1 > number2){
                number1 = number1 - number2;
            } else{
                number2 = number2 - number1;
            }
        }
        return number1;
    }
    
    private void reduce (){
        int GCF = GreatestCommonFactor (numerator, denominator);
        numerator /= GCF;
        denominator /= GCF;
    }
    
    public static Fraction multiply(Fraction one, Fraction two){
        Fraction fraction = new Fraction ();
        fraction.numerator = one.numerator*two.numerator;
        fraction.denominator = one.denominator*two.denominator;
        fraction.reduce();
        return fraction;
    }
    
    public static Fraction divide(Fraction one, Fraction two){
        Fraction fraction = new Fraction ();
        fraction.numerator = one.numerator*two.denominator;
        fraction.denominator = one.denominator*two.numerator;
        fraction.reduce();
        return fraction;
    }
    
    public static Fraction add(Fraction one, Fraction two){
        Fraction fraction = new Fraction ();
        fraction.denominator = one.denominator*two.denominator;
        fraction.numerator = one.numerator*two.denominator + one.denominator*two.numerator;
        fraction.reduce();
        return fraction;
    }
    
    public static Fraction subtract(Fraction one, Fraction two){
        Fraction fraction = new Fraction ();
        fraction.denominator = one.denominator*two.denominator;
        fraction.numerator = one.numerator*two.denominator - one.denominator*two.numerator;
        fraction.reduce();
        return fraction;
    }
    
    public static Fraction randomFraction(){
        Fraction fraction = new Fraction();
        fraction.numerator = (int) (Math.random()*9)+1;
        fraction.denominator = (int) (Math.random()*9)+1;
        fraction.reduce();
        return fraction;
    }
    
    public static char randomOperation(){
        int r = (int) (Math.random()*4);
        char operation = ' ';
        if (r == 0){
            operation = '+';
        }
        else if (r == 1){
            operation = '-';
        }
        else if (r == 2){
            operation = '*';
        }
        else if (r == 3){
            operation = '/';
        }
        return operation;
    }
    
    public static String evaluate(Fraction one, Fraction two, char operator){
        if (operator == '+'){
            return Fraction.add(one, two).toString();
        } else if (operator == '-'){
            return Fraction.subtract(one, two).toString();
        } else if (operator == '*'){
            return Fraction.multiply(one, two).toString();
        } else {
            return Fraction.divide(one, two).toString();
        }
    }
}
