import java.util.Scanner;
public class BuyEggs
{
    public static void main (String[] args)
    {
        final float PRICE_PER_DOZEN = 3.25F;
        final float PRICE_PER_EGG = 0.45F;

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs would you like to order? >> ");
        int numEggs = input.nextInt();

        int dozens = numEggs/12; // calculate number of dozens
        int looseEggs = (numEggs%12); // calculate of loose eggs per order

        float costDozens = dozens * PRICE_PER_DOZEN;
        float costEggs = looseEggs * PRICE_PER_EGG;
        float totalCost = costEggs + costDozens;

        System.out.print("You ordered " + numEggs + " eggs. That’s " + dozens + " dozen at $3.25 per dozen and " + looseEggs + " loose eggs at 45 cents each for a total of $" + totalCost);

    }


}
