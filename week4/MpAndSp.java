package week4;
import java.util.Scanner;


/**
 * Write a description of class MpAndSp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MpAndSp
{
     public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Categories: A,B,C,D");
    String cat=sc.nextLine();
    
    System.out.println("Enter The MP:");
    float mp=sc.nextFloat();
    
    
     float spA=mp-(mp*0.6f);
     float spB=mp-(mp*0.4f);
     float spC=mp-(mp*0.2f);
     float spD=mp-(mp*0.1f);
     if(cat.equalsIgnoreCase("A")){
         
         System.out.println("Your Selling Price rs."+spA);
        }
         if(cat.equalsIgnoreCase("B")){
         
         System.out.println("Your Selling Price rs."+spB);
        }
         if(cat.equalsIgnoreCase("C")){
         
         System.out.println("Your Selling Price rs."+spC);
        }
         if(cat.equalsIgnoreCase("D")){
         
         System.out.println("Your Selling Price rs."+spD);
        }
     
    
    
    
}
}