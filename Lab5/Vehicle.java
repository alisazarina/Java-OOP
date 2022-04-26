package Lab5;

/**
 *
 * @author Alisa Zarina
 */
public abstract class Vehicle {                                 // abstract class since italic based on UML diagram
    protected int manufacturedYear;
    protected double price;    
    
    public Vehicle(int year, double price) {
    manufacturedYear = year;
    this.price = price;
    }
    
    public abstract void displayVehicle();                      // abstract method so no body

}
