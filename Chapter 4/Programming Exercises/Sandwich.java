/*
  a. Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a String for bread type (such as wheat), and a double for price (such as 4.99). 
     Include methods to get and set values for each of these fields. Save the class as Sandwich.java.
     
  b. Create an application named TestSandwich that prompts the user for data, instantiates one Sandwich object, and displays its values. Save the application as TestSandwich.java.
*/

public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    public void setMainIngredient(String mainIngredient)
    {
        this.mainIngredient = mainIngredient;
    }

    public void setBreadType(String breadType)
    {
        this.breadType = breadType;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public double getPrice()
    {
        return price;
    }
}

import java.util.Scanner;
public class TestSandwich {
    public static void main(String[] args)
    {
        String ingredient;
        String type;
        double price;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the main ingredient>> ");
        ingredient = input.nextLine();

        System.out.println("Enter the bread type>> ");
        type = input.nextLine();

        System.out.println("Enter the price>> ");
        price = input.nextDouble();

        Sandwich tunaSandwich = new Sandwich();
        tunaSandwich.setMainIngredient(ingredient);
        tunaSandwich.setBreadType(type);
        tunaSandwich.setPrice(price);

        System.out.println("Main ingredient: " + tunaSandwich.getMainIngredient() +
                            "\n Bread type: " + tunaSandwich.getBreadType() +
                            "\n Price: " + tunaSandwich.getPrice());
    }
}

