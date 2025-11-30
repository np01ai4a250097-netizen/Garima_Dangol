package week4;
import java.util.Scanner;


/**
 * Write a description of class A4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A4
{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Paper Size:");
    String size=sc.nextLine();
    
    switch(size){
        case "A0": System.out.println("841 x 1189 mm (33.1 x 46.8 inches)");
        break;
        
        case "A1": System.out.println("594 x 841 mm (23.4 x 33.1 inches)");
        break;
        
        case "A2": System.out.println("594 x 841 mm (23.4 x 33.1 inches)");
        break;
        
        case "A3": System.out.println("297 x 420 mm (11.7 x 16.5 inches)");
        break;
        
        case "A4": System.out.println(": 210 x 297 mm (8.3x 11.7 inches) ");
        break;
        
        case "A5": System.out.println(": 148 x 210 mm (5.8 x 8.3");
        break;
        
         
         default:
         System.out.println(" Invalid ");
    }
}
}