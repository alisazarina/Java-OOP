package Assignment1;

/**
 *
 * @author 
 */
public class Books extends Product {    //Create subclass that has 2 additional variables
    public String authorName;
    public int pageNumb;
    
    public Books () {
        super();
        String authorName;
        int pageNumb;
    }
    
    public Books (int itemNumb, String productName, int stockQty, double itemPrice, String authorName, int pageNumb) {
        super(itemNumb, productName, stockQty, itemPrice);
        this.authorName = authorName;
        this.pageNumb = pageNumb;
    }
    
    public double calcInventoryValue (int stockQty, double itemPrice) {    //Override to calculate value of each items 
        double inventoryValue;
        double restockFee;
        double total;
                
        inventoryValue = super.getStockQty() * super.getItemPrice();
        restockFee = 0.05 * inventoryValue;
        total = inventoryValue + restockFee;
        
        return total;
    }
        
    @Override           //Override from Product class that will show information of new objects
    public String toString () {
        return ("Item number: "+super.getItemNumb()+", Product Name: "+super.getProductName()+", Quantity of stock: "+super.getStockQty()+", Item price: " +super.getItemPrice()+", Author name: "+authorName+", Page numbers: "+pageNumb);
    }
}
