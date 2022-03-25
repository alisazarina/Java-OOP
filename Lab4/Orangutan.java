package Lab4;

/**
 *
 * @author Alisa Zarina
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
    
//    public void displayDetail() {
//        System.out.println(super.animalClassf + " , " + super.totalNumber);             // will not display animalClassf because it's declared private in Animal class
//}
    @Override
    public String toString() {
        return("Type of animal: " + super.getAnimalClassf() + "\nTotal number: " + super.totalNumber);
    }

}

