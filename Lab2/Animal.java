package Lab2;

/**
 *
 * @author 
 */
public class Animal {
    public String animalClassf;
    public int totalNumber;
    
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
}

