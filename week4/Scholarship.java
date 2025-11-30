package week4;
import java.util.Scanner;


/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter The GPA from0.0 to 4.0:");
    float GPA=sc.nextFloat();
    
    System.out.println("Enter The attendance in %");
    float attendance=sc.nextFloat();
    
    System.out.println("Enter The attitude");
    float attitude=sc.nextFloat();
    
    if(GPA<=4.0 && attendance<=100 && attitude<=5){
        if(GPA>=3.2){
            System.out.println("Grade is elligible");
        
        if(attendance>=80){
            System.out.println("Attendence is elligible");
        
        
        if(attitude<5){
            System.out.println("Attitude is elligible");
        
            
            System.out.println("You are  elligible");
        }}}
        else{
           System.out.println("You are not elligible.");
        }
    }
    else{
    System.out.println("Invalid.");
    }
    }

}