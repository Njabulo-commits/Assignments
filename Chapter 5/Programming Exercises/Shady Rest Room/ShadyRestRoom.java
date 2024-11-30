/*
  a. Write an application for the Shady Rest Hotel; the program determines the price of a room. 
  Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch. The output echoes the input and displays the price of the room: $125 for queen, 
  $139 for king, and $165 for a suite with a king bed and a pullout couch. 
  If the user enters an invalid code, display an appropriate message and set the price to 0. Save the file as ShadyRestRoom.java.
*/
import java.util.Scanner;
public class ShadyRestRoom {
    public static void main(String args[])
    {
        int roomChoice;
        String roomType = "";
        int price = 0;

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to select an option
        System.out.println("Welcome to Shady Rest Room");
        System.out.println("Please select a room type:" +
                "\n 1. Queen size ($125)" +
                "\n 2. King size ($139)" +
                "\n 3. King size and pullout couch ($165)");
        System.out.println("Enter your choice (1, 2, or 3)");
        roomChoice = input.nextInt();

        // Evaluate the user's choice
        switch (roomChoice)
        {
            case 1:
                roomType = "Queen size";
                price = 125;
                break;
            case 2:
                roomType = "King size";
                price = 139;
                break;
            case 3:
                roomType = "King size and pullout couch";
                price = 165;
                break;
            default:
                price = 0;
        }

        // Display room type and price
        if(price > 0)
        {
            System.out.print("Thank you for selecting the " + roomType + ". The cost of the room will be $" + price);
        }
        else
        {
            System.out.println("You entered an invalid number. Please choose between 1, 2, or 3 ");
        }

        input.close();
    }
}

