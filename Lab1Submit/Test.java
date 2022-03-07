/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1Submit;

/**
 *
 * @author  NURLIA AZRINA
 *          NUR ALISA ZARINA BINTI NAZMI
 *          NUR AINA AZREEN
 *          NURIN NASUHA
 */
public class Test {
    public static void main(String[] args) {
        
        //Print out Tiger
        System.out.println("Animal species: Tiger");
        Tiger T1 = new Tiger ();
        System.out.println("General appearance: " + T1.generalAppearance + ", " + "Total number: " + T1.totalNumber);
        
        Tiger T2 = new Tiger ("Short and broad head", 6);
        System.out.println("General appearance: " + T2.generalAppearance + ", " + "Total number: " + T2.totalNumber);
        System.out.println(T2.fact());
        
        //Print out Wolf
        System.out.println("\nAnimal species: Wolf");
        Wolf W1 = new Wolf ();
        System.out.println("General appearance: " + W1.generalAppearance + ", " + "Total number: " + W1.totalNumber);
        
        Wolf W2 = new Wolf ("Short ears with rounded tips", 4);
        System.out.println("General appearance: " + W2.generalAppearance + ", " + "Total number: " + W2.totalNumber);
        System.out.println(W2.fact());
        
        //Print out Orangutan
        System.out.println("\nAnimal species: Orangutan");
        Orangutan O1 = new Orangutan ();
        System.out.println("General appearance: " + O1.generalAppearance + ", " + "Total number: " + O1.totalNumber);
        
        Orangutan O2 = new Orangutan ("Ape-like shape", 2);
        System.out.println("General appearance: " + O2.generalAppearance + ", " + "Total number: " + O2.totalNumber);
        System.out.println(O2.fact());
        
        //Print out Panda
        System.out.println("\nAnimal species: Panda");
        Panda P1 = new Panda ();
        System.out.println("General appearance: " + P1.generalAppearance + ", " + "Total number: " + P1.totalNumber);
        
        Panda P2 = new Panda ("Black fur around their eyes ", 3);
        System.out.println("General appearance: " + P2.generalAppearance + ", " + "Total number: " + P2.totalNumber);
        System.out.println(P2.fact());

    }
}
