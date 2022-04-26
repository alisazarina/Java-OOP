package Lab5;

/**
 *
 * @author Alisa Zarina
 */
public class Vehicle {
    protected int manufacturedYear;
    protected double price;    
    
    public Vehicle(int year, double price) {
    manufacturedYear = year;
    this.price = price;
    }
    
    public void displayVehicle() {
        System.out.println("Vehicle details:");
        System.out.println("\nManufactured year: " + manufacturedYear);
        System.out.println("\nPrice: " + price);
    }

}
