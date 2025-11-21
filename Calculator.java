import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[]arg)
 {
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the First Number:");
    float firstNumber=sc.nextFloat();
    System.out.println("Enter the Second Number:");
    float secondNumber=sc.nextFloat();
    
    float sum =firstNumber + secondNumber;
    float diff =firstNumber - secondNumber;
    float div =firstNumber / secondNumber;
    
    float rem = firstNumber % secondNumber;
    float multiply =firstNumber * secondNumber;
    
    System.out.println("The sum is :"+ sum);
    System.out.println("The difference is:"+ diff);
    System.out.println("The division is:"+div);
    System.out.println("The reminder is:"+rem);
    System.out.println("The multipication is:"+multiply);
}
}
