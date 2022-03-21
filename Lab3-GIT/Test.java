package LAB3;

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
        System.out.println("Animal: \n" +A1);         //display detailed information about the objects
        
        //Print out orangutan
        Orangutan O1 = new Orangutan ();
        Orangutan O2 = new Orangutan ("Orangutan", 2);
        System.out.println("\nOrangutan: \n" +O1);
        System.out.println(O2);
        
        //Print out panda
        Panda P1 = new Panda ("Panda", 3);
        System.out.println("\nPanda: \n" +P1);
        
        //Print out tiger
        Tiger T1 = new Tiger ("Tiger", 6);
        System.out.println("\nTiger: \n" +T1);
        
        //Print out wolf
        Wolf W1 = new Wolf ("Wolf", 4);
        System.out.println("\nWolf: \n" + W1);
        
        
    }
}
