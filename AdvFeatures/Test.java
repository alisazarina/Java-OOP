package AdvFeatures;

/**
 *
 * @author Alisa Zarina
 */
public class Test {
    
    public static void main(String[] args)
    {   // Vehicle ride1 = new Car(1.5);
            Aeroplane ride2 = new Aeroplane(1000);      // use polymorphism
            
        // ride1.DsiplayVehicleDetails();
            ride2.DisplayVehicleDetails();              // call polymorphic method
            
        // ride2.takeOff();
        // ride2.land();
        // ride2.fly();
    }
}
