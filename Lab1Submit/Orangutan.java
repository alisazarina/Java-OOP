package Lab1Submit;

/**
 *
 * @author  NUR ALISA ZARINA
 */

public class Orangutan {
    
    public String generalAppearance;
    public int totalNumber;
    
    public Orangutan () {
        generalAppearance = "Shaggy reddish fur";
        totalNumber = 2;
    }

    public Orangutan(String generalAppearance, int totalNumber) {
        this.generalAppearance = generalAppearance;
        this.totalNumber = totalNumber;
    }
   
    public static String fact() {
        return "What is a fun fact about Orangutans? \nOrangutans can eat with their feet!";
    }
}
