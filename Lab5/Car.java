package Lab5;

/**
 *
 * @author Alisa Zarina
 */

public class Car extends Vehicle implements Transporter {
    private String carType;
    private double ccValue;
    
    public String getCarType() {
        return carType;
    }
    
    public void setCarType(String carType) {
        this.carType = carType;
    }
    
    public double getCcValue() {
        return ccValue;
    }
    
    public void setCcValue(double ccValue) {
        this.ccValue = ccValue;
    }
    
    public Car(int year, double price, String type, double cc) {
    super(year, price);
    carType = type;
    ccValue = cc;
    }
    
    @Override
    public void displayVehicle() {
        System.out.println("Car Details:");
        System.out.println("\nManufactured year: " + super.manufacturedYear);
        System.out.println("\nPrice : " + super.price);
        System.out.println("\nType of car: " + carType);
        System.out.println("\nCubic capacity of car: " + ccValue);    
    }
    
    @Override
    public void howToTransport() {
        System.out.println("\nCar moves on the road...");
    }
}
