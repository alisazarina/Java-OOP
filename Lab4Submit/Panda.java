package Lab4Submit;

/**
 *
 * @author 
 */
public class Panda extends Animal {
    
    public Panda () {
        super();
    }
    
    public Panda (String animalClassf, int totalNumber) {
        super(animalClassf, totalNumber);
    }
    
    public static String fact() {
        return "What is a fun fact about Pandas? \nPandas spend a lot of their day eating!";
    }
    
    @Override       
    public String toString() {
        return ("Animal classifications: " + super.getAnimalClassf() + ", Total number: " + super.totalNumber);
    }
}
