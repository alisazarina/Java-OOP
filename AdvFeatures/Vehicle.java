package AdvFeatures;

/**
 *
 * @author Alisa Zarina
 */
public abstract class Vehicle {             // once you declare this abstract class, you cannot create objects in this class (only can create objects in subclasses)
                                            // (once you do the above) + declare abstract method => MUST declare at least one subclass!
    
    protected int manufacturedYear;         // inherited by all its subclasses, even if they are in diff packages.
    protected double price;
    
    public Vehicle(int year, double price) // Vehicle constructor
    {
        manufacturedYear = year;
        this.price = price;
    }
    
//    public abstract void DisplayVehicleDetails() {} // abstract method -- cannot have a body, ie. "{}" -- only can have a header / signature(?)
    
    public abstract void DisplayVehicleDetails();       // abstract method -- data will be collected via subclass!
    
//    public void DisplayVehicleDetails() {       
//        
//    }
}
