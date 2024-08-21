import java.util.Scanner;
public class QuartsToGallonsInteractive {


    public static void main(String[] args)
 {
     final int QUARTS_PER_GALLON = 4;

     Scanner input = new Scanner(System.in);

     System.out.print("Please enter the number of quarts need >> ");
     int quartsNeeded = input.nextInt();
     int gallons = quartsNeeded / QUARTS_PER_GALLON;
     int quartsRemaining = quartsNeeded % QUARTS_PER_GALLON;
     System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallons plus " + quartsRemaining + " quarts");

 }
}
