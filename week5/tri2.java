package week5;


/**
 * Write a description of class tri2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tri2
{
    public static void main(String[]arg){
        for(int i=1; i<=5; i++){
            for(int j=i; j<=5; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }  
}