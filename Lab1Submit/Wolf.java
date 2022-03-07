/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Submit;
/**
 *
 * @author NURIN NASUHA
 */
public class Wolf {
    
    public String generalAppearance;
    public int totalNumber;
    
    Wolf() {
        generalAppearance = "Large nose pad";
        totalNumber = 4;
    }
    
    Wolf(String generalAppearance, int totalNumber) {
        this.generalAppearance = generalAppearance;
        this.totalNumber = totalNumber;
    }
   
    public static String fact () {
    return "What is a fun fact about Wolves? \nWolves fur color are Gray, but can also be black or white!" ;
    }
    
}