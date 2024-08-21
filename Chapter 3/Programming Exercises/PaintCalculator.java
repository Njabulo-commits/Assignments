
import java.util.Scanner;
public class PaintCalculator {
    public static void main(String [] args)
    {
        double length;
        double width;
        double height;
        double wallArea;
        double gallonsNeeded;
        double cost;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the wall (feet)>> ");
        length = input.nextDouble();

        System.out.println("Enter width of the wall (feet)>> ");
        width = input.nextDouble();

        System.out.println("Enter height of the wall (feet)>> ");
        height = input.nextDouble();

        wallArea = calculateArea(length, width, height);
        gallonsNeeded = calculateGallons(wallArea);
        cost = computePrice(gallonsNeeded);

        System.out.print("The cost to paint a " + width + "-by-" + length + "-foot room with " + height + "-foot ceilings is $" + cost);

    }

    public static double calculateArea(double length, double width, double height)
    {
        return 2 * (height * length + height * width);
    }


    public static double calculateGallons(double area)
    {
        final double SQFT_PER_GALLON = 350;
        return Math.ceil(area/SQFT_PER_GALLON);
    }

    public static double computePrice(double gallons)
    {
        final double PRICE_PER_GALLON = 32;
        return gallons * PRICE_PER_GALLON;
    }
}
