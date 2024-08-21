import java.util.Scanner;

public class TimeConverter
{
    public static void main(String[] args)
    {
        final int HOURS_PER_DAY = 24; // 1day = 24hrs
        final int MINUTES_PER_DAY = 60; // ihr = 60 min
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes >> ");
        int minutes = input.nextInt();

        float hours = (float)(minutes/MINUTES_PER_DAY);
        float days = (hours/HOURS_PER_DAY);

        System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");

    }
}
