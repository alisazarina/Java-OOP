package Assignment1;

/**
 *
 * @author NURLIA AZRINA
 *         ALISA ZARINA
 *         NUR AINA AZREEN
 *         NURIN NASUHA
 *  
 * Course Name: Object Oriented Programming
 * Course Code: ISB16003
 * Assessment: Assignment
 */

import java.util.*;
public class Test {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner (System.in);   //scanner object instantiation
        
        //Display information of Product 
        Product P1 = new Product ();
        Product P2 = new Product (1, "Books", 10, 1.50);
        P2.setItemNumb(1001);
        P2.setProductName("Code Complete");
        P2.setItemPrice(110.90);
        P2.setStockQty(10);
        System.out.println(P1);
        System.out.println(P2);
        
        //Display information of Books
        Books B1 = new Books ();
        Books B2 = new Books (1002, "Head First Java", 5, 214.67, "Kathy Sierra", 720);
        System.out.println("\n"+B1);
        System.out.println(B2);
        
        //Ask user to enter number of products
        System.out.print("\nEnter number of products you wish to add: ");    
        int n = sc.nextInt();
        int itemNumb[] = new int [n];         
        String productName[] = new String [n];  
        int stockQty[] = new int [n];         
        double itemPrice[] = new double [n];
        double inventoryValue[] = new double [n];

        if (n == 0) {
            System.out.println("Zero (0) number entered!");     //Handle the value of zero
        } 
        
        //Ask user to input values for the items
        for (int i =0; i < n; i++) {
            System.out.print("\nEnter item number " + (i+1) + ": ");
            itemNumb[i] = sc.nextInt();
            sc.nextLine();      //Prints the rest of the current line, leaving out the line separator at the end
            
            System.out.print("Enter product name " + (i+1) + ": ");
            productName[i] = sc.nextLine();
            
            System.out.print("Enter quantity of stocks " + (i+1) + ": ");
            stockQty[i] = sc.nextInt();
            
            System.out.print("Enter item price " + (i+1) + ": RM ");
            itemPrice[i] = sc.nextDouble();      
            
            Product pd = new Product();
            inventoryValue[i] = pd.calcInventoryValue(stockQty[i],itemPrice[i]);    //method invocation to calculate value of each items
        }
        
        //Display the information one product at a time
        System.out.println("\nItem Number\tProduct Name\tStock Quantity\tItem Price\tInventory Value");
        for (int i = 0; i < n; i ++) {
            System.out.println(itemNumb[i]+"\t\t"+productName[i]+"\t\t"+stockQty[i]+"\tRM "+String.format("%.2f",itemPrice[i])+"\tRM "+String.format("%.2f",inventoryValue[i]));
        }
    }
}
    