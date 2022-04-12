package Assignment1;

/**
 *
 * @author Alisa Zarina
 */

// Q7 Create a subclass of the Product class that has 2 additional variables.
public class CD extends Product {
    
    public CD() {
        super();
    }
    
    public CD (int productNumber, String productName, int productStock, double productPrice) {
        super(productNumber, productName, productStock, productPrice);
    }
    
    public String albumTitle;
    public String artistName;
    
    public CD(String albumTitle, String artistName) {
        this.albumTitle = albumTitle;
        this.artistName = artistName;
    }
    
    // Q8 Override the method to calculate inventoryValue + add a 5% restocking fee to the value of the inventory of the product.
//    @Override
    
    
//    public String toString() {
//        return("Type of animal: " + super.getAnimalClassf() + "\nTotal number: " + super.totalNumber);
//    }
    
    
}
