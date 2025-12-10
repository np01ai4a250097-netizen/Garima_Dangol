package week5;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[]arg){
        // can be incorrrect so do not inalitize int num;
        for(int i=1; i<=100; i++)
        {
            if(i%7==0 && i%9==0){

                System.out.println("The first number divisible by both 7 and 9 is = "+i);

            }
        }
    }
}