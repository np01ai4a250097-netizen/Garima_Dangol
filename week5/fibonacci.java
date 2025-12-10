package week5;
import java.util.Scanner;

/**
 * Write a description of class fibonacci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fibonacci
{
    public static void main(String[]arg){

        int fibo=0;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1; i<8; i++){
            fibo=a+b;
            a=b;
            b=fibo;
            System.out.println(fibo);
        }

        
    }
}