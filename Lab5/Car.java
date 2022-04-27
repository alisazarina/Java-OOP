package Lab5;

/**
 *
 * @author Alisa Zarina
 */

public class Car extends Vehicle implements Transporter {
    private String carType;
    private double ccValue;
    
    public Car(String type, double cc) {
    super(1996, 400000.00);
    carType = type;
    ccValue = cc;
    }
    
    @Override
    public void displayVehicle() {
        System.out.println("Car Details:");
        System.out.println("\nManufactured year: " + manufacturedYear);
        System.out.println("\nPrice : " + price);
        System.out.println("\nType of car: " + carType);
        System.out.println("\nCubic capacity of car: " + ccValue);    
    }
    
    @Override
    public void howToTransport() {
        System.out.println("\nHow do cars move?");
        System.out.println("\nCars move on the road...");
    }
}
