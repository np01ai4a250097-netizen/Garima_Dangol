package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Rickshwafare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshwafare
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you local? Type Y if yes");
        String local = sc.nextLine();

        System.out.println("Is the travel during the night? Type Y if yes");
        String nightTravel = sc.nextLine();

        System.out.println("Enter the distance in km:");
        int distanceKm = sc.nextInt();

        System.out.println("Enter the time in minutes:");
        int timeMin = sc.nextInt();

        int baseFare=20;
        int perKilo=15;
        int perMin=10;
        
         float fare= baseFare + (perKilo*distanceKm) + (perMin* timeMin);
         
         float fare2= fare-(0.10f  * fare); // with discount
         float fare3=fare + (fare*0.13f); //extra for night shift 
         float fare4= fare3 -(fare*0.10f); //nightshift with discount for locals
         
         
         
         
        if(local.equalsIgnoreCase("Y")){
         
         System.out.println("Local fare with 10 % discount= rs."+fare2);
        }
        else{
        System.out.println("Normal Fare = Rs."+fare);}
        
        if(local.equalsIgnoreCase("Y") && (nightTravel.equalsIgnoreCase("Y")))
        {
        System.out.println("Local Fare for Night Shift = Rs."+fare4);
        }
         
        if( !local.equalsIgnoreCase("Y") &&  nightTravel.equalsIgnoreCase("Y")){
         System.out.println("Normal Fare for Night Shift = Rs."+fare3);   
        }
            }
}