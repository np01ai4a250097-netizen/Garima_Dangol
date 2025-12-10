package week5;
import java.util.Scanner;

/**
 * Write a description of class PrimeNum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeNum
{
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the required number.");
        int num=sc.nextInt();

        int count=0;

        for(int i=1; i<=num; i++){
            if(num%i==0)
            {
                count=count+1;  
            }
        }
        if(count==2)// because it is divisible by only 1 and itself
        {
            System.out.println("number is prime.");
        }
        else
        {
            System.out.println("number is not prime.");
        }
    }
}