package Lab4Submit;

/**
 *
 * @author 
 */
public class Orangutan extends Animal {
    
    public Orangutan () {
        super();
    }
    
    public Orangutan (String animalClassf, int totalNumber) {
        super(animalClassf, totalNumber);
    }
    
    public static String fact() {
        return "What is a fun fact about Orangutans? \nOrangutans can eat with their feet!";
    }
    
    @Override       
    public String toString() {
        return ("Animal classifications: " + super.getAnimalClassf() + ", Total number: " + super.totalNumber); //use getAnimalClassf to access private variable in parent class-Animal
    }
}