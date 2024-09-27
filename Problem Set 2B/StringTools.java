
/**
 * Iris Guo
 * Sept. 25, 2024
 * problem set 2B
 */
public class StringTools
{
    //takes a String and returns the last character in the String.
    public String lastLetter(String str)
    {
        int number = str.length();
        return str.substring (number-1);
    }
    
    //takes a 10-digit String of numbers and returns a String of those digits formatted as a phone number. 
    public String formatPhoneNumber(String str1)
    {
        String one = str1.substring(0, 3);
        String second = str1.substring(3, 6);
        String third = str1.substring(6, 10);
        return "(" + one + ") " + second + "-" + third;
    }
    
    //takes a String and returns a substring of length 3 from the String’s middle. The String length should be an odd number. 
    public String middleThree(String str2)
    {
        int number = str2.length();
        int number1 = (number-3)/2;
        return str2.substring(0 + number1, number-number1);
    }
    
    //takes a String and returns a new String with the last 2 characters swapped. 
    public String swapLastTwo (String str3)
    {
        int number = str3.length();
        return str3.substring(0, number-2) + str3.substring(number-1) + str3.substring(number-2, number-1);
    }
    
    //takes a String and an int. It returns true if its first n characters are the same as its last n characters. Assume the String parameter’s length will be at least n characters long. 
    public boolean frontAgain (String str4, int n)
    {
        String part1 = str4.substring(0, n);
        int number = str4.length();
        String part2 = str4.substring(number-n, number);
        return part1.equals(part2);
    }
}
