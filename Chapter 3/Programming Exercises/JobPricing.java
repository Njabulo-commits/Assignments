/*
The Renew Your Home Company estimates each job cost as the cost of materials plus $35 per hour
while on the job, plus $12 per hour for travel time to the job site. Create a class that contains
a main() method that prompts the user for the name of a job (for example, Patel bathroom remodel),
the cost of materials, the number of hours of work required, and the number of hours of travel time.
Pass the numeric data to a method that computes an estimate for the job and returns the computed
value to the main() method, where the job name and estimated price are displayed. 
Save the program as JobPricing.java.
 */
import java.util.Scanner;
public class JobPricing {

    public static void main(String[] args)
    {
        String name;
        float materialCost;
        float workHours;
        float travelHours;
        float jobCost;
        Scanner input = new Scanner(System.in);

        System.out.println("Provide the job name>> ");
        name = input.nextLine();
        System.out.println("What is the cost of the materials required>> ");
        materialCost = input.nextFloat();
        System.out.println("How many labour hours are required for the job?>> ");
        workHours = input.nextFloat();
        System.out.println("Time required for travel? (hours)>> ");
        travelHours = input.nextFloat();

        jobCost = computeJobCost(materialCost, workHours, travelHours);
        System.out.print("The job cost for " + name + " amounts to $" + jobCost);
    }

    public static float computeJobCost(float materialCost, float workHours, float travelHours)
    {
        final int LABOUR_COST = 35;
        final int TRAVEL_COST_PER_HOUR = 12;
        float jobCost;
        jobCost = materialCost + LABOUR_COST * workHours + TRAVEL_COST_PER_HOUR * travelHours;
        return jobCost;
    }
}
