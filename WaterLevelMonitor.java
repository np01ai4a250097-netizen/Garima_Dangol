import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The water level in liter:");
    double waterLevel=sc.nextDouble();
    
    System.out.println("The Water level is:"+waterLevel+"Liters");
    if(waterLevel>=1000)
    {
        System.out.println("The Water level is 1000l or more");
        
    }
    else
    System.out.println("The Water level is normal");
}
}