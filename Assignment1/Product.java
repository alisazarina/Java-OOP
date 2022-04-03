package Assignment1;

/**
 *
 * @author Alisa Zarina
 */

// Q1-2 Create a Product class with instance variables.
public class Product {
    private int productNumber;
    public String productName;
    public int productStock;
    protected double productPrice;
    
    //Q4 Write a getter/accessor and setter/mutator method for each variable.    
    // Getter/Accessor methods for all variables.
    public int getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }
    
    public int getProductStock() {
        return productStock;
    }

    public double getProductPrice() {
        return productPrice;
    }
    
    
    // Setter/Mutator method for all variables.
    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
  
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    
    // Q3(a) Create a default constructor.
    public Product () {   
        System.out.println("This is the default constructor.");
        productNumber = 0;
        productName = null;
        productStock = 0;
        productPrice = 0;
    }
    
    
    // Q3(b) Overload default constructer + create constructor with parameters for all 4 instance variables.  
    public Product (int productNumber,                                      
                    String productName,
                    int productStock,
                    double productPrice)
    {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productStock = productStock;
        this.productPrice = productPrice;       
    }
    
    
    // Q5 Override the toString() method from the Object class.
    @Override       
    public String toString() {
        return ("Item number: " + productNumber 
                + "\nName: " + productName 
                + "\nStock available: " + productStock 
                + "\nPrice per unit: RM" + productPrice);
    }
    
    
    // Q6 Create a method to calculate the value of each inventory item (= qty on hand (stock) * price).
    public double inventoryValue(int productStock, double productPrice) {
        double value = productStock * productPrice;
        return value;
    }
        
}
