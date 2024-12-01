import java.util.Scanner;

public class CellPhoneService {

    public static void main(String args[])
    {
        // Declare the necessary fields
        final int AVG_MINUTES = 500;
        final int AVG_TEXTS = 100;
        final int AVG_GIGABYTES = 3;
        int minutes;
        int texts;
        int gigabytes;
        String plan;
        Float price;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Horizon Phones!");

        // Prompt user for input
        System.out.println("Enter the amount of monthly minutes>> ");
        minutes = input.nextInt();
        System.out.println("Enter the amount of monthly text messages>> ");
        texts = input.nextInt();
        System.out.println("Enter the amount of monthly data>> ");
        gigabytes = input.nextInt();

        // Decide which payment plan to recommend to the client
        if (minutes < AVG_MINUTES && texts == 0 && gigabytes == 0)
            {
                plan = "Plan A";
                price = 49F;
            } else if (minutes < AVG_MINUTES && texts > 0 && gigabytes == 0) {
                plan = "Plan B";
                price = 55F;
            }

        else if (minutes >= AVG_MINUTES && gigabytes == 0)
        {
            if (texts <= AVG_TEXTS)
                {
                    plan = "Plan C";
                    price = 55F;
                }
            else{
                plan = "Plan D";
                price = 70F;
            }
        }

        else if(gigabytes <= AVG_GIGABYTES)
            {
                plan = "Plan E";
                price = 79F;
            }
        else
            {
                plan = "Plan F";
                price = 87F;
            }

        System.out.println("The recommended payment plan is " + plan +
                    " which will cost $" + price + "/month.");
    }
}

