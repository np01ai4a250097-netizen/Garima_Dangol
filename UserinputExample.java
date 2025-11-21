import java.util.Scanner;

/**
 * Write a description of class UserinputExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserinputExample
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in); // scanner is a inbuilt keyword
    System.out.println("Enter the first number");
    int firstNumber=sc.nextInt();
    System.out.println("Enter the second number");
    int secondNumber=sc.nextInt();
    
    int sum=firstNumber+secondNumber;
    System.out.println("The sum is "+sum);
     
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        // or string bigger=(firstNumber>secondNumber)?"FirstNumber is greater":"SecondNumber is greater";
        System.out.println("Bigger number is" +bigger);
        sc.close();
        
}
}