/*
Mad Libs is a children’s game in which the players provide a few words that are then incorporated into a silly 
story. For example, you might ask a child for the name of an animal, a number, and a direction. The child might 
reply with such answers as dog, 13, and east. The newly created Mad Lib might be:
Hickory Dickory Dock.
The dog ran up the clock.
The clock struck 13.
The dog ran east.
Hickory Dickory Dock.
Create a program that asks the user to provide a few words. Then send the words to a method that displays a 
short story or nursery rhyme that uses them. Save the file as MadLibWithMethod.java.
*/
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
