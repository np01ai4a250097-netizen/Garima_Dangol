package workshop3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Numeric grade");
    int a=sc.nextInt();
    String result=(a>=40)?"PASS":"Fail";
    System.out.println( result);
    
    
    }
}