package Assignment1;

/**
 *
 * @author 
 */
public class Product {      //Product class with instance variables
    private int itemNumb;   //Instance variable is any variable declared outside any methods & without static keyword
    private String productName;
    private int stockQty;
    private double itemPrice;
    
    
    //default constructor, initialize numeric with zeros & String with nulls
    public Product () {     
    }
    
    //Overloaded constructor, with parameters for all 4 instance variables
    public Product (int itemNumb, String productName, int stockQty, double itemPrice) {    //Overloaded constructor, initialize parameters
        this.itemNumb = itemNumb;
        this.productName = productName;
        this.stockQty = stockQty;
        this.itemPrice = itemPrice;
    }
    
    public double calcInventoryValue (int stockQty, double itemPrice) {    //to calculate value of each items   
        double inventoryValue;
        
        inventoryValue = stockQty * itemPrice;
        
        return inventoryValue;
    }
    
    @Override          //Override from Object class that will show information of each object
    public String toString () {
        return ("Item number: "+itemNumb+", Product Name: "+productName+", Quantity of stock: "+stockQty+", Item price: "+itemPrice);
//        return ("Product: "+itemNumb+",\t"+productName+",\t"+stockQty+",\t"+String.format("%.2f",itemPrice));
    }
        
    // Getter/Setter methods for all variables ~ allow access & modify/ set private variables
    public int getItemNumb() {      
        return itemNumb;
    }

    public void setItemNumb(int itemNumb) {     
        this.itemNumb = itemNumb;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}

