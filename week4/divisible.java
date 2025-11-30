package week4;
import java.util.Scanner;


/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[]arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The number:");
    int num1=sc.nextInt();
    
    if(num1%3==0 && num1%5==0){
        System.out.println("Divisible by both 3 and 5.");
    }
    else if(num1%3==0 ){
        System.out.println("Divisible by 3.");
    }
    else if(num1%5==0 ){
        System.out.println("Divisible by  5.");
    }
    
    else
    {
        System.out.println(" Not Divisible by both 3 and 5."); 
    }
    }
    
}