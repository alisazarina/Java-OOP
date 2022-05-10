package Lab6;

/**
 *
 * @author Alisa Zarina
 */
import java.util.*;         // for user input
        
public class Test {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);            // scanner class -- user input
        
        // create two Sales objects + assign values
        Sales s1 = new Sales ("SALE6003", 800);
        Sales s2 = new Sales("SALE7003", 500);
        
        // update values of object s2
        s2.setSalesId("SALE5003");
        s2.setAmount(500);
        
        // display objects -- method call to display objects as parameters (???)
//        public String displaySalesObject() {
//            return ("")
//        }

//        normal display:
//        System.out.println(s1);
//        System.out.println(s2);

        
    }
}
