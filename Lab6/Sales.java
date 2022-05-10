package Lab6;

/**
 *
 * @author Alisa Zarina
 * 
 * from UML:
 One String private data fields named salesId that specify the Id of the Sales.
 One double private data fields named amount that specify the amount of the sales
 A no-arg constructor that creates a default sales.
 A constructor that creates a sales with the specified salesId and amount.
 The accesser and mutator methods for all the data fields.
 A method named determineDiscount() that returns the discount of this sales.
  * 
 */

public class Sales {
   private String salesId;
   private double amount;
    
   // default or no-arg constructor
    public Sales() {       
    }
    
    // constructor with specified salesId and amount
    public Sales(String salesId, double amount) {
        this.salesId = salesId;
        this.amount = amount;
    }
    
    // accesser and mutator for all data
    public String getSalesId() {
        return salesId;
    }

    public double getAmount() {
        return amount;
    }
      
    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }    
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    // method named determineDiscount() that returns discount of sales
    // -- not sure if determineDiscount() should be atas or bawah? also not sure of calculation!!
    public double calcDiscount(double amount, int discount) {
        double determineDiscount;
        
        determineDiscount = (amount * discount) / 100;
        
        return determineDiscount;
    }
    
    // discount table:
    // if sales ≥ 900, then 10% discount
    // if sales 500 ≤ sales ≤ 900, then 8% discount
    // if sales < 500, then 4% discount
    
}
