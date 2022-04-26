package Lab5;

/**
 *
 * @author Alisa Zarina
 */

public class Aeroplane extends Vehicle implements Transporter {
    private String modelNo;
    private int capacity;
    
    public String getModelNo() {
        return modelNo;
    }
    
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public Aeroplane(int year, double price, String modelNo, int capacity) {
        super(year, price);
        this.modelNo = modelNo;
        this.capacity = capacity;
    }
    
    public void displayVehicle() {       
        System.out.println("Aeroplane Details:");
        System.out.println("\nManufactured year: " + super.manufacturedYear);
        System.out.println("\nPrice : " + super.price);        
        System.out.println("\nModel of aeroplane: " + modelNo);
        System.out.println("\nCapacity: " + capacity);
    }
    
    @Override
    public void howToTransport() {
        System.out.println("\nAeroplane moves in the air...");
    }
}
