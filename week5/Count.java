package week5;
import java.util.Scanner;

/**
 * Write a description of class Count here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Count
{
    public static void main(String[]arg){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the required number= ");
        int num=sc.nextInt();
        
        int oddCount=0;
        int evenCount=0;

        int num2 =num; //to make sure the value of num changes each time
        while(num2 !=0)
        {
            int num3 = num2 % 10;
            if(num3%2 == 0)
            {
                evenCount ++;
            }
            else
            {
                oddCount++;
            }
            num2= num2/10;
        }
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }


}