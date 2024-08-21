/*
Modify the class named InchConversion. Its main() method accepts a value
in inches from a user at the keyboard, and in turn passes the entered
value to two methods. One converts the value from inches to feet, and the
other converts the same value from inches to yards.

There are 12 inches in a foot and 3 feet in a yard.

Each method displays the results with appropriate explanation.

An example of the program is shown below:

Enter inches >> 430
430 inches is 35.833333333333336 feet
430 inches is 11.944444444444445 yards
 */

import java.util.Scanner;
public class InchConversion {

    public static void main(String[] args)
    {
        float inches;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of inches>> ");
        inches = input.nextFloat();

        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(float inches)
    {
        final float ONE_FOOT = 12.00F;
        float numFeet;
        numFeet = inches/ONE_FOOT;
        System.out.println(inches + " inches is equal to " + numFeet + " feet");
    }

    public static void convertToYards(float inches)
    {
        final float ONE_FOOT = 12.00F;
        final float ONE_YARD = 3.00F;
        float numFeet;
        float numYards;

        numFeet = inches/ONE_FOOT;
        numYards = numFeet/ONE_YARD;
        System.out.println(inches + " inches is equal to " + numYards + " yard(s)");
    }

}
