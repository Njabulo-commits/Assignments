/*
  b. Add a prompt to the `ShadyRestRoom` application to ask the user to specify a (1) lake view or a (2) park view, but ask that question only if the bed size entry is valid. 
  Add $15 to the price of any room with a lake view. If the view value is invalid, display an appropriate message and assume that the price is for a room with a lake view. 
  Save the file as `ShadyRestRoom2.java.`
*/

import java.util.Scanner;
public class ShadyRestRoom2 {
    public static void main(String args[])
    {
        int roomChoice;
        int viewChoice;
        String roomType = "";
        int roomPrice = 0;
        final int LAKE_PRICE = 15;
        int totalCost = 0;

        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to select an option
        System.out.println("Welcome to Shady Rest Room");
        System.out.println("Please select a room type:" +
                "\n 1. Queen size ($125)" +
                "\n 2. King size ($139)" +
                "\n 3. King size and pullout couch ($165)");
        System.out.println("Enter your choice (1, 2, or 3)");
        
        // Read user input for bed type
        roomChoice = input.nextInt();

        // Evaluate the user's choice
        switch (roomChoice)
        {
            case 1:
                roomType = "Queen size";
                roomPrice = 125;
                break;
            case 2:
                roomType = "King size";
                roomPrice = 139;
                break;
            case 3:
                roomType = "King size and pullout couch";
                roomPrice = 165;
                break;
            default:
                roomPrice = 0;
        }

        // Display room type and price
        if(roomPrice > 0)
        {
            // Prompt the user to select a view
            System.out.println("Please select a view: " +
                    "\n 1. Lake View ($15)" +
                    "\n 2. Park View");
            
            // Read user input for view type
            viewChoice = input.nextInt();

            // Evaluate user choice
            switch(viewChoice)
            {
                case 1:
                    totalCost = roomPrice + LAKE_PRICE;
                    break;
                case 2:
                    totalCost = roomPrice;
                    break;
                default:
                    totalCost = roomPrice + LAKE_PRICE;
            }
            System.out.print("Thank you for selecting the " + roomType + ". The cost of the room will be $" + totalCost);
        }
        else
        {
            System.out.println("The price is $0" +
                    "\nYou entered an invalid number. Please choose between 1, 2, or 3 ");
        }

        input.close();
    }
}

