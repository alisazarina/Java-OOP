package Lab1;

/**
 *
 * @author NurAlisaZarina-52213121129
 */

// Create class for Lion (blueprint/template).
public class Lion {
    
    // Create attributes of Lion (declare variables).
    public String speciesType;
    public int totalNumber;
    
    // Create constructor + assign 2 parameters.
    public Lion(String speciesType, int totalNumber) {
        this.speciesType = speciesType;
        this.totalNumber = totalNumber;
    }
    
    // Create instance method to return String value.
    public static String fact() {
        return "Female lions are the main hunters.";
    }
}
// End of Lion class (blueprint/template).
