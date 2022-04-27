package Lab5;

/**
 *
 * @author Alisa Zarina
 */

public class Aeroplane extends Vehicle implements Transporter {
    private String modelNo;
    private int capacity; 
    
    public Aeroplane(int year, double price, String modelNo, int capacity) {
        super(2000, 150000.00);
        this.modelNo = modelNo;
        this.capacity = capacity;
    }
    
    public void displayVehicle() {       
        System.out.println("Aeroplane Details:");
        System.out.println("\nManufactured year: " + manufacturedYear);
        System.out.println("\nPrice : " + price);        
        System.out.println("\nModel of aeroplane: " + modelNo);
        System.out.println("\nCapacity: " + capacity);
    }
    
    @Override
    public void howToTransport() {
        System.out.println("\nHow do aeroplanes move?");
        System.out.println("\nAeroplanes move in the air..." + "\n");
    }
}
