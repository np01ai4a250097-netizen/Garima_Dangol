package Week6;

/**
 * Write a description of class SumOfArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfArray
{
    public static void main(String[]arg){
        int [] priceList={10,34,56,78,97};
        int sum=0;

        for(int i=0; i<priceList.length; i++)
        {
            sum=sum+priceList[i];
        }
        System.out.println("The total sum is " +sum);
        
        
    }
}