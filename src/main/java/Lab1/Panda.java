package Lab1;

/**
 *
 * @author AlisaZarina
 */

// Create class for Panda (blueprint/template).
public class Panda {
    
    // Create attributes of Panda (declare variables).
    public String speciesType;
    public int totalNumber;
    
    // Create constructor + assign 2 parameters.
    public Panda(String speciesType, int totalNumber) {
        this.speciesType = speciesType;
        this.totalNumber = totalNumber;
    }
    
    // Create instance method to return String value.
    public static String fact() {
        return "Pandas eat and sleep all day.";
    }
}
// End of Panda class (blueprint/template).
