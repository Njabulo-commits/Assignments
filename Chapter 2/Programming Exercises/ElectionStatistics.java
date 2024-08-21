import java.util.Scanner;

public class ElectionStatistics
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of 1st Political Party >> ");
        String partyA = input.nextLine();

        System.out.println("Provide the number of votes received the previous election >> ");
        int votesA = input.nextInt();
        input.nextLine();

        System.out.println("Enter name of 2nd Political Party >> ");
        String partyB = input.nextLine();

        System.out.println("Provide the number of votes received the previous election >> ");
        int votesB = input.nextInt();
        input.nextLine();

        System.out.println("Enter name of 3rd Political Party >> ");
        String partyC = input.nextLine();

        System.out.println("Provide the number of votes received the previous election >> ");
        int votesC = input.nextInt();
        input.nextLine();

        int percentageA = votesA/100 * 10;
        int percentageB = votesB/100 * 10;
        int percentageC = votesC/100 * 10;

        System.out.println("According to the stats collected on last year's elections " + partyA + " obtained " + percentageA + "% of the votes, "
        + partyB + "obtained " + percentageB);


    }

}
