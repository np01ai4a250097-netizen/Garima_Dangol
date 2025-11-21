package workshop3;
import java.util.Scanner;


/**
 * Write a description of class MathOperatons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperatons
{
    public static void main(String []arg)
    {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=sc.nextInt();
    System.out.println("Enter the second number");
    int b=sc.nextInt();
    
    int larger=(a>b)?a:b;
    System.out.println("The larger number is" +larger);
     
    int smaller=(a<b)?a:b;
    System.out.println("The smaller number is" +smaller);
        

    System.out.println("a>b"+(a>b)+"\n"+"a<b"+(a<b)+"\n"+"a=b"+(a==b)+"\n"+"a=b"+(a==b)+"\n"+"a>=b"+(a>=b)+"\n"+"a<=b"+(a<=b)+"\n"+"a!=b"+(a!=b));
    
    
    
    }
}