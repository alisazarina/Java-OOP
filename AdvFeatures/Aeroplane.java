package AdvFeatures;

/**
 *
 * @author Alisa Zarina
 */
public class Aeroplane extends Vehicle implements Flyer {
    
//    private final int billPassenger;      <-- suggested by NetBeans
    private int billPassenger;
    
    public Aeroplane(int passenger)             // Aeroplane constructor
    {
        super (1990, 500000.0);                 // to call super object (parent class)
        billPassenger = passenger;              // assign value for billPassenger
    }
    
    public void DisplayVehicleDetails()         // implementatation -- display Car details
    {
        System.out.println("\nAeroplane details: ");
        System.out.println("Year Manufactured: "
                + manufacturedYear);
        System.out.println("Price: " + price);
        System.out.println("Bill Passenger: " + billPassenger);
    }
    
    // implements all abstract methods in interface
    @Override
    public void takeOff() {
        System.out.println("\nAeroplane is taking off ... ");
    }
    
    @Override
    public void land() {
        System.out.println("\nAeroplane is landing ...");
    }
    
    @Override
    public void fly() {
        System.out.println("\nAeroplane is flying ...");
    }
}
