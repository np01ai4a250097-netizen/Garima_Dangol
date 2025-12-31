package Week8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[]agg){
        ShoppingCart ss= new ShoppingCart("Books",200, 3);
        ss.display();
        
        ss.setQuantity(5);
      //ss.display(); not valid in this but bcan be falid if the vale was displayed in setter 
      System.out.println("Updated Quantity: " + ss.getQuantity());
        
      double total = ss.calculateTotal();
        System.out.println("Total Price: " + total);
        
        System.out.println( ss.calculateDiscount(20));
        
    }
}