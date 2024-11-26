//25.07.24
/*
a. Create a class named Lease with fields that hold an apartment tenant’s name, apartment number, monthly rent amount, and term of the lease in months. 
Include a default constructor that initializes the name to XXX, the apartment number to 0, the rent to 1000, and the term to 12. Also include methods 
to get and set each of the fields. Include a non-static method named addPetFee() that adds $10 to the monthly rent value and calls a static method 
named explainPetPolicy() that explains the pet fee. Save the class as Lease.java.
*/

public class Lease {
    private String tenantName;
    private int apartmentNumber;
    private double rent;
    private int term;

    public Lease()
    {
        tenantName = "XXX";
        apartmentNumber = 0;
        rent = 1000.00;
        term = 12;
    }

    // Set values for the private fields
    public void setName(String tenantName)
    {
        this.tenantName = tenantName;
    }
    public void setApartmentNumber(int apartmentNumber) {this.apartmentNumber = apartmentNumber;}
    public void setRent(double rent)
    {
        this.rent = rent;
    }
    public void setTerm(int term)
    {
        this.term = term;
    }


    // retrieve/get the values stored in the private fields.
    public String getName()
    {
        return tenantName;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }
    public double getRent()
    {
        return rent;
    }
    public int getTerm()
    {
        return term;
    }

    //Method that adds fee to rental bill if tenant has a pet
    public void addPetFee()
    {
        rent = rent + 10;
        explainPetPolicy();
        System.out.println("Therefore total cost of rent per month amounts to $" + rent);
    }

    public void explainPetPolicy()
    {
        System.out.println("An extra amount of $10 is charged for each pet that will reside on the premises");
    }

}



