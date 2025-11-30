package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Days here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Days
{
     public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the days ");
    int day=sc.nextInt();
    int year= day/365;
    int  r= day%365;
    int month = r/30;
    int days=r%30;
    
    
    System.out.println("In year :"+ year);
    System.out.println("In month :"+ month);
    System.out.println("In days :"+ days);
    
    
    
    System.out.print("month");
    System.out.println("days");
    
    
    }
}