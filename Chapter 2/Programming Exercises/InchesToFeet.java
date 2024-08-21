import java.util.Scanner;

public class InchesToFeet
{
    public static void main (String[] args)
    {
        final int INCHES_PER_FOOT = 12;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of inches >> ");
        int inches = input.nextInt();

        int feet = inches/INCHES_PER_FOOT;
        int inchesRemaining = inches % INCHES_PER_FOOT;
        System.out.println("An object that is " + inches + "inch(es) long is " + feet + " feet plus " + inchesRemaining + " inch(es)");
    }
}
