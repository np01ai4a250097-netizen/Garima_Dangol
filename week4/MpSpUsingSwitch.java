package week4;
import java.util.Scanner;


/**
 * Write a description of class SwitchMpSp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MpSpUsingSwitch
{
    public static void main(String[]arg)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The Category:");
    String cat=sc.nextLine();
    
    System.out.println("Enter The MP:");
    float mp=sc.nextFloat();
    
    
    float spA=mp-(mp*0.6f);
     float spB=mp-(mp*0.4f);
     float spC=mp-(mp*0.2f);
     float spD=mp-(mp*0.1f);
    
    switch(cat){
        case "A": System.out.println("Your Selling Price rs."+spA);
        break;

         case "B": System.out.println("Your Selling Price rs."+spB);
        break;
        
         case "C": System.out.println("Your Selling Price rs."+spC);
        break;
        
         case "D": System.out.println("Your Selling Price rs."+spD);
        break;
        
        default:
         System.out.println(" Invalid ");

    } 
    }
}