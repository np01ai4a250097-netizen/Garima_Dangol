package workshop3;
import java.util.Scanner;


/**
 * Write a description of class RickshwaWithNextLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshwaWithNextLine
{
    // instance variables - replace the example below with your own
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in km:");
        int distanceKm = sc.nextInt();

        System.out.println("Enter the time in minutes:");
        int timeMin = sc.nextInt();

        sc.nextLine(); //nextInt() reads only the number, but it does NOT remove the newline (\n) that you press when you hit Enter.so we are using this statement


        System.out.println("Are you local? Type Y if yes");
        String local = sc.nextLine();

        System.out.println("Is the travel during the night? Type Y if yes");
        String nightTravel = sc.nextLine();
        
        int baseFare=20;
        int perKilo=15;
        int perMin=10;
        
         float fare= baseFare + (perKilo*distanceKm) + (perMin* timeMin);
         
         float fare2= fare-(0.10f  * fare); // with discount
         float fare3=fare + (fare*0.13f); //extra for night shift 
         float fare4= fare3 -(fare*0.10f); //nightshift with discount for locals
         
         
         //the method writth down is a little diff them of Rickshwafare
        if (nightTravel.equalsIgnoreCase("Y")) {
            
            if (local.equalsIgnoreCase("Y")) {
                System.out.println("Local Fare for Night Shift = Rs." + fare4);
            } else {
                System.out.println("Normal Fare for Night Shift = Rs." + fare3);
            }
        } else {
            if (local.equalsIgnoreCase("Y")) {
                System.out.println("Local fare with 10% discount = Rs." + fare2);
            } else {
                System.out.println("Normal Fare = Rs." + fare);
            }
        }
            }
        }