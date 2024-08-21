import java.util.Scanner;
public class NumberDemo {
    public static int displayTwiceTheNumber(int a)
    {
        int product;
        product = a * 2;
        return product;
    }

    public static int displayNumberPlusFive(int a)
    {
        int sum;
        sum = a + 5;
        return sum;
    }

    public static int displayNumberSquared(int a)
    {
        int answer;
        answer = a*a;
        return answer;
    }

    public static void main(String[] args)
    {
        int x;
        int y;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer>> ");
        x = input.nextInt();
        System.out.println("Enter another integer>> ");
        y = input.nextInt();

        System.out.println(x + " multiplied by 2 is equal to " + displayTwiceTheNumber(x));
        System.out.println(y + " multiplied by 2 is equal to " + displayTwiceTheNumber(y));
        System.out.println(x + " plus 5 is equal to " + displayNumberPlusFive(x));
        System.out.println(y + " plus 5 is equal to " + displayNumberPlusFive(y));
        System.out.println(x + " squared is " + displayNumberSquared(x));
        System.out.println(y + " squared is " + displayNumberSquared(y));
    }
}
