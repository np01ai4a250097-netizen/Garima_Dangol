package Week6;
import java.util.Arrays;

/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grade
{
    public static void main(String[]arg)
    {
        int sum=0;
        int average;
        
        int [] grade={10,20,30,40,50};
        int highestScore=grade[0];
        int lowestScore=grade[0];
        for(int i=0; i<grade.length; i++){
            System.out.println(grade[i]);
            sum= sum+grade[i];
            
            if(grade[i]>highestScore){
                highestScore=grade[i]; 
            }
            if(grade[i]<lowestScore){
                lowestScore=grade[i]; 
            }
            
        }
         
        System.out.println("The sum is = "+sum);
        average= sum/grade.length;
        System.out.println("The average is = "+average);
        System.out.println("Highest Score is "+highestScore);
        System.out.println("Lowest Score is "+lowestScore);
    }
}