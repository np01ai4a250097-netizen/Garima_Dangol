package week4;
import java.util.Scanner;


/**
 * Write a description of class EvenOddExample here. //
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddExample
{
    public static void main(String[] arg){
    Scanner sc=  new Scanner(System.in);
    System.out.println("Enter the number");
    int num1=sc.nextInt();
    if(num1%2 ==0){
        System.out.println("The number "+num1+" is even.");
    }
    else{
    System.out.println("The number "+num1+" is odd.");
    }
    System.out.println("The test is finished.");
    }
    
}