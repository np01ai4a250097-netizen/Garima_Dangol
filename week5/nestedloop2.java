package week5;


/**
 * Write a description of class nestedloop2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedloop2
{
    public static void main(String[]arg){
    for(int i=1; i<=3; i++){
        for(int j=1; j<=i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    }
}