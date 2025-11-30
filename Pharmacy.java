import java.util.Scanner;

/**
 * Write a description of class Pharmacy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

import java.util.Scanner;

public class Pharmacy {
    
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        String medicine1="Niko";
        int price1=24;
        int stock1=999;
        
        String medicine2 = "Paracetamol";
        int price2 = 15;
        int stock2 = 500;

        String medicine3 = "Synex";
        int price3 = 30;
        int stock3 = 300;
        
        System.out.println("Enter the name of the medicine");
        String medName =sc.nextLine(); //here the name is medName istead of medicine1 because in calculation we only ned user given data not already available ones.
        
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
        if (quantity<=0 )
        {
            System.out.println("Quantity must be positive");
            sc.close();
            return;
        }
        
       String result =
            (medName.equalsIgnoreCase(medicine1) && quantity <= stock1) ? calculateAndDisplay(medicine1, quantity, price1, stock1) :
            (medName.equalsIgnoreCase(medicine2) && quantity <= stock2) ? calculateAndDisplay(medicine2, quantity, price2, stock2) :
            (medName.equalsIgnoreCase(medicine3) && quantity <= stock3) ? calculateAndDisplay(medicine3, quantity, price3, stock3) :
            "Medicine not found or insufficient stock";
        
        System.out.println(result);
        sc.close();
    }
private static String calculateAndDisplay(String med, int qty, int pricePerUnit, int stock)// automacially calculateAndDisplay(medicine1, quantity, priceperunit1, stock1) is alculateAndDisplay(String med, int qty, int pricePerUnit, int stock) but only inside this block.
        
 {
        int totalPrice = qty * pricePerUnit;
        int newStock = stock - qty;
        return "Medicine: " + med +
               "\nQuantity: " + qty +
               "\nTotal Price: " + totalPrice +
               "\nStock left: " + newStock;
        
    }
}






