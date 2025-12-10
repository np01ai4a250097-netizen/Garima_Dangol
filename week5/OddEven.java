package week5;

/**
 * Write a description of class OddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEven
{
    public static void main(String[]arg){
        int sum=0;
        int sum2=0;
        int sum3=0;
        for( int i=1; i<=10; i++)
        {

            if(i%2==0){
                sum2= sum2 +i ;
            }
            else{
                sum3= sum3 + i;
            }
        } 
        System.out.println("Sum of even numbers "+ sum2);
        System.out.println("Sum of odd numbers "+ sum3);

    }

}