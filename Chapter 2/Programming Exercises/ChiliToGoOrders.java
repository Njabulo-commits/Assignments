import java.util.Scanner;

public class ChiliToGoOrders {
    public static void main(String[] args)
    {
        final int ADULT_PRICE = 7;
        final int CHILD_PRICE = 4;
        final float ADULT_PRODUCTION_COST = 4.35F;
        final float CHILD_PRODUCTION_COST = 3.10F;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Adult meals >> ");
        int numAdults = input.nextInt();
        input.nextLine();
        System.out.print("Enter number of kiddie meals >> ");
        int numChild = input.nextInt();

        int totalCost = (numAdults * ADULT_PRICE) + (numChild * CHILD_PRICE);
        float totalProfitAdult = numAdults * ADULT_PRICE - ADULT_PRODUCTION_COST;
        float totalProfitChild = numChild * CHILD_PRICE - CHILD_PRODUCTION_COST;
        float totalProfit = totalProfitAdult + totalProfitChild;

        System.out.println("You have ordered " + numAdults + " adult meals and " + numChild + " kiddie meals.");
        System.out.println("The total cost of your order amounts to $" + totalCost + ".");
        System.out.println("The total profit made from the Adult meals is $" + totalProfitAdult);
        System.out.println("The total profit made from the Kiddie meals is $" + totalProfitChild);
        System.out.println("The grand total profit made from the order is $" + totalProfit);
    }
}
