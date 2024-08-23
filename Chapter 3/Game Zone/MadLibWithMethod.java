import java.util.Scanner;
public class MadLibWithMethod {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        displayMadLib(requestAnimalName(), requestNumber(), requestDirection());
    }

    // Method that request for name of an animal.
    public static String requestAnimalName()
    {

        System.out.print("Enter a name of any animal>> ");
        String name = input.nextLine();
        return name;
    }

    // Request for a number.
    public static int requestNumber()
    {
        System.out.print("Enter a number>> ");
        int number = input.nextInt();
        return number;
    }

    //Request for direction
    public static String requestDirection()
    {
        input.nextLine(); // Collect the abandoned Enter Key.
        System.out.println("Enter a direction (e.g. 'North'>> ");
        String direction = input.nextLine();
        input.close();
        return direction;
    }

    // Display MadLib
    public static void displayMadLib(String animalName, int number, String direction )
    {
        System.out.println("*Hickory Dickory Dock.*\n" +
                "\n" +
                "      *The " + animalName + " " + "ran up the clock.*\n" +
                "\n" +
                "     *The clock struck " + number + ".*\n" +
                "\n" +
                "    *The " + animalName + " " + "ran " + direction + ".*\n" +
                "\n" +
                "   *Hickory Dickory Dock.*");
    }
}
