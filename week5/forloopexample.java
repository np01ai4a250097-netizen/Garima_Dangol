package week5;


/**
 * Write a description of class forloopexample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class forloopexample
{
    public static void main(String[]arg){
        int sum=0;
    for(int x=1; x<=10; x++){
        if(x%2==0){
            sum=x+sum; // sum+=x;
            
            
        }
    }
    System.out.print(sum);
    
    }
    
}