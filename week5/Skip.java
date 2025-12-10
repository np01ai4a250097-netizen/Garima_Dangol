package week5;

/**
 * Write a description of class Skip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skip
{
    public static void main(String[]arg){
        for(int i=0; i<=100; i++)
        {
            if(i%13 !=0){
                continue;
            }
            else{
                System.out.println( i +" is divisible by 13");
            }
        }
    }
}