/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab1Submit;

/**
 *
 * @author NUR AINA AZREEN
 */
public class Panda {
    
    public String generalAppearance;
    public int totalNumber;
    
    public Panda () {
        generalAppearance = "Black and white coat";
        totalNumber = 3;
    }
    public Panda(String generalAppearance, int totalNumber){
        this.generalAppearance = generalAppearance;
        this.totalNumber = totalNumber;
       
    }
    public static String fact (){
        return "What is a fun fact about Pandas? \nPandas spend a lot of their day eating!";
    }
}