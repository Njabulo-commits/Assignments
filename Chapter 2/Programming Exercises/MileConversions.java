import java.util.Scanner;

public class MileConversions
{
    public static void main(String[] args)
    {
        final int INCHES_PER_MILE = 63360;
        final int FEET_PER_MILE = 5280;
        final int YARD_PER_MILE = 1760;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of miles >> ");
        int miles = input.nextInt();

        int inches = miles * INCHES_PER_MILE;
        int feet = miles * FEET_PER_MILE;
        int yards = miles * YARD_PER_MILE;

        System.out.println("A distance of " + miles + " miles is " + inches + " inches.");
        System.out.println("A distance of " + miles + " miles is " + feet + " feet.");
        System.out.println("A distance of " + miles + " miles is " + yards + " yards.");
    }
}
