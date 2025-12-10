package week5;

/**
 * Write a description of class tri1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tri1
{
    public static void main(String[]arg){
        for(int i=5; i>=1; i--){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }  
}