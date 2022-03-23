package Lab3;

/**
 *
 * @author 
 */
public class Tiger extends Animal {
    
    public Tiger () {
        super();    //super keyword is use to call superclass constructor/ methods/ data members - attributes
    }
    
    public Tiger (String animalClassf, int totalNumber) {
        super(animalClassf, totalNumber);
    }
    
    public static String fact() {
        return "What is a fun fact about Tigers? \nTigers are the largest cat species in the world!";
    }

}
