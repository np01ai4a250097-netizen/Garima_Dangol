package week5;
import java.util.Scanner;


/**
 * Write a description of class dowhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class resturantManagementSystem
{
    public static void main(String[]arg){
    
    Scanner sc= new Scanner(System.in);
    int choice;
    int quantity;
    int totalBill=0;
    do
    {
        System.out.println("Resturant Menu");
        System.out.println("1: pizza rs 500");
        System.out.println("2: Momo rs 300");
        System.out.println("0: Bill");
        System.out.println("Enter the choice");
        choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:System.out.println(" Youu have order pizza");
             System.out.println("Enter the quantity.");
             quantity=sc.nextInt();
             totalBill=totalBill+(quantity*500);
             break;
        case 2:System.out.println(" Youu have order Momo");
             System.out.println("Enter the quantity.");
             quantity=sc.nextInt();
             totalBill=totalBill+(quantity*300);
             
             break;
        case 0:System.out.println(" TotalBill is RS." +totalBill);
        break;
        
        default:System.out.println(" Try again.");
    
    }
        
        
    }while(choice!=0);
    
    
    }
}