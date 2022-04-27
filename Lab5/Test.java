package Lab5;

/**
 *
 * @author Alisa Zarina
 */

public class Test {
    public static void main(String[] args) {
        Car ride1 = new Car("Sedan", 198);         // instantiate Car objects with parameters        
        ride1.displayVehicle();                    // display details by calling method        
        ride1.howToTransport();                    // invoke (call) howToTransport() from Transporter


        Aeroplane ride2 = new Aeroplane("Boeing 747-8", 660);
        ride2.displayVehicle();
        ride2.howToTransport();
    }
    
}
