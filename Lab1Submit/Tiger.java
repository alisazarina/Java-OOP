/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1Submit;

/**
 *
 * @author NURLIA AZRINA
 */
public class Tiger {
    public String generalAppearance;
    public int totalNumber;
    
    Tiger () {  //first constructor
        generalAppearance = "Striped coat";
        totalNumber = 6;
    }
    
    Tiger (String generalAppearance, int totalNumber) {  //second constructor
        this.generalAppearance = generalAppearance;
        this.totalNumber = totalNumber;
    }
    
    public static String fact() {
        return "What is a fun fact about Tigers? \nTigers are the largest cat species in the world!";
    }
}