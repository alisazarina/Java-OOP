package Lab4;

/**
 *
 * @author 
 */
public class Animal {
    private String animalClassf;        // right-click on animalClassf > click "Insert Code..." > "Getter and Setter" (optional in Encapsulation; it's a modification to retrieve data from private variables)
    public int totalNumber;

    // Get/Getter (accessor) method generated             // if you allow people to view, but not modify the data.
    public String getAnimalClassf() {
        return animalClassf;
    }

    // Set/Setter (mutator) method generated             // if you allow people to modify, but not view the data.
    public void setAnimalClassf(String animalClassf) {
        this.animalClassf = animalClassf;
    }

    // if both Get & Set modifications possible, then include both. but can insert certain conditions, eg. only authorised personnel allowed to change the private data.
    
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