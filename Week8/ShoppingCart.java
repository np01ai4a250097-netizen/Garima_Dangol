package Week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    public ShoppingCart(String itemName,double itemPrice,int quantity){
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
        
        
}
public void display()
    {
        System.out.println("Name is "+this.itemName);
        System.out.println("Price is "+this.itemPrice);
        System.out.println("Quantity is "+this.quantity);
    
    }
public void setQuantity(int quantity){ //setter
    if(quantity>=0){
        this.quantity=quantity;
    }
    else{
        System.out.println("Quantity cannot be negative");
    }
    
}
public int getQuantity(){//getter we could also return value in getter
    return this.quantity;
}
/*public int setQuantity(int quantity){ 
   if(quantity>=0){ this.quantity=quantity; } 
   else{ System.out.println("Quantity cannot be negative"); } 
   return this.quantity; } */ //setter returning the value.
   
   public double calculateTotal(){
       return this.itemPrice * this.quantity;
   }
   public String calculateDiscount(double discountPercent){
       double total = calculateTotal();
       double discount= total*(discountPercent/100);
       return  "Total after " + discountPercent + "% discount is " + discount;
       
   }
}

