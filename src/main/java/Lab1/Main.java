package Lab1;

/**
 *
 * @author AlisaZarina
 */
public class Main {
    
    public static void main(String[] args) {
        
        // Print Lion object.
        Lion L1 = new Lion("Lion", 4);
        System.out.println("Type of animal: " +L1.speciesType+ ", Total number:  " +L1.totalNumber);        
        System.out.println("What is a fun fact about " +L1.speciesType+ "s?");
        System.out.println(L1.fact());
        System.out.println(" ");
        
        // Print Panda object.
        Panda P1 = new Panda("Panda", 3);
        System.out.println("Type of animal: " +P1.speciesType+ ", Total number: " +P1.totalNumber);
        System.out.println("What is a fun fact about " +P1.speciesType+ "s?");
        System.out.println(P1.fact());
        System.out.println(" ");
        
        // Print Elephant object.
        Elephant E1 = new Elephant("Elephant", 1);
        System.out.println("Type of animal: " +E1.speciesType+ ", Total number: " +E1.totalNumber);
        System.out.println("What is a fun fact about " +E1.speciesType+ "s?");
        System.out.println(E1.fact());
        System.out.println(" ");
        
        // Print Orangutan object.
        Orangutan O1 = new Orangutan("Orangutan", 2);
        System.out.println("Type of animal: " +O1.speciesType+ ", Total number: " +O1.totalNumber);
        System.out.println("What is a fun fact about " +O1.speciesType+ "s?");
        System.out.println(O1.fact());
        System.out.println(" ");        
    }
}
