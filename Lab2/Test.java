package Lab2;

/**
 *
 * @author NURLIA AZRINA
 *         NUR ALISA ZARINA
 *         NUR AINA AZREEN
 *         NURIN NASUHA
 */
public class Test {
    public static void main (String[] args) {
        
        //Print out animal
        Animal A1 = new Animal ();
        System.out.println("Animal classifications: " +A1.animalClassf);
        System.out.println(A1.fact());
        
        //Print out orangutan
        Orangutan O1 = new Orangutan ();
        System.out.println("\nOrangutan classifications: " +O1.animalClassf);
        System.out.println(O1.fact());
        
        //Print out panda
        Panda P1 = new Panda ();
        System.out.println("\nPanda classifications: " +P1.animalClassf);
        System.out.println(P1.fact());
        
        //Print out tiger
        Tiger T1 = new Tiger ();
        System.out.println("\nTiger classifications: " +T1.animalClassf);
        System.out.println(T1.fact());
        
        //Print out wolf
        Wolf W1 = new Wolf ();
        System.out.println("\nWolf classifications: " +W1.animalClassf);
        System.out.println(W1.fact());
    }
}