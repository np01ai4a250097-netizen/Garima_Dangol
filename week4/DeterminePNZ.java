package week4;
import java.util.Scanner;


/**
 * Write a description of class PassOrFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeterminePNZ
{
    public static void main(String[] arg){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    
    if(num>0){
        System.out.println(num+" is Positive");}
        else if(num<0) {
            System.out.println(num+" is Negaive");
        }
        else{
        System.out.println(num+" is Zero");
        }
    
    }
}