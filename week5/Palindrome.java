package week5;
import java.util.Scanner;

/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number.");
        int num=sc.nextInt();

        int rev=0;

        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse is "+ rev);
        if(rev==num){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is  not palindrome");
        }

    }
}