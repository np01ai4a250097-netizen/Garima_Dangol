package week4;
import java.util.Scanner;


/**
 * Write a description of class TicketPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you an adult, child or elderly:");
        String age = sc.nextLine();

        System.out.println("Is there any festival going? (yes/no)");
        String festival = sc.nextLine();

        System.out.println("Language other than Nepali? (Hindi/English/None)");
        String language = sc.nextLine();

        System.out.println("Are you a student? (yes/no)");
        String student = sc.nextLine();

        int price = 0;

        
        if (age.equalsIgnoreCase("adult")) {
            price = 250;
        } 
        else if (age.equalsIgnoreCase("child")) {
            price = 150;
        } 
        else if (age.equalsIgnoreCase("elderly")) {
            price = 200;
        } 
        else {
            System.out.println("Invalid age group!");
            return;
        }

        float finalPrice = price;

        // Festival discount 15%
        if (festival.equalsIgnoreCase("yes")) {
            finalPrice =finalPrice - (price * 0.15f);
        }

        // Language extra cost
        if (language.equalsIgnoreCase("Hindi")) {
            finalPrice = finalPrice + 50;
        } 
        else if (language.equalsIgnoreCase("English")) {
            finalPrice = finalPrice +100;
        }

        // Student discount 2%
        if (student.equalsIgnoreCase("yes")) {
            finalPrice = finalPrice - (price * 0.2f);  
        }

        System.out.println("Your price is: Rs. " + finalPrice);
    }
}
