package Lab4Submit;

/**
 *
 * @author 
 */
public class Animal {
    private String animalClassf;
    public int totalNumber;
    
    public String getAnimalClassf() {       //allow access to get private variable/information
        return animalClassf;
    }
    
    public void setAnimalClassf(String animalClassf) {      //allow access to adjust/set private variable/information
        this.animalClassf = animalClassf;
    }
    
    public Animal () {
        animalClassf = "Mammal";
        totalNumber = 4;
    }
    
    public Animal (String animalClassf, int totalNumber) {
        this.animalClassf = animalClassf;
        this.totalNumber = totalNumber;
    }
    
    public static String fact () {
        return "All animal have fun facts!";
    }
    
    @Override       
    public String toString() {
        return ("Animal classifications: " + animalClassf + ", Total number: " + totalNumber);
    }
}