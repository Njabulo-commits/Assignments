/*a. Create an application named Percentages whose main() method holds
two double variables. Assign values to the variables. Pass both variables to
a method named computePercent() that displays the two values and the
value of the first number as a percentage of the second one. For example, if
the numbers are 2.0 and 5.0, the method should display a statement similar
to “2.0 is 40 percent of 5.0.” Then call the method a second time, passing the
values in reverse order. Save the application as Percentages.java.
b. Modify the Percentages class to accept the values of the two doubles from a
user at the keyboard. Save the file as Percentages.java.*/

import java.util.Scanner;
public class Percentages {
    public static void computePercent(double x, double y)
    {
        double percentage;
        double percentage2;
        
        percentage = x/y * 100;
        System.out.println(x + " is " + percentage + "% of " + y);

        percentage2 = y/x * 100;
        System.out.println(y + " is " + percentage2 + "% of " + x);

    }

    public static void main(String[] args)
    {
        double a;
        double b;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number>> ");
        a = input.nextDouble();
        System.out.println("Enter second number>> ");
        b = input.nextDouble();
        computePercent(a,b);
    }
}
