package Lab1;

/**
 *
 * @author AlisaZarina
 */

public class Orangutan {
    
    public String speciesType;
    public int totalNumber;
    

    public Orangutan(String speciesType, int totalNumber) {
        this.speciesType = speciesType;
        this.totalNumber = totalNumber;
    }
   
    public static String fact() {
        return "Orangutans can eat with their feet!";
    }
}

