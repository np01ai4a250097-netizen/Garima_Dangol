package workshop3;
import java.util.Scanner;


/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the distance in km:");
        //System.out.println("Enter the time in minutes:");
        //System.out.println("Are you local? Type Y if yes");
        //System.out.println("Is the travel during the night? type Y if yes");
        //int distanceKm=sc.nextInt();
        //int timeMin=sc.nextInt();
        //String local=sc.nextLine();
        //String nightTravel=sc.nextLine();
        
        //ALL THE ABOVE ARE INCORRECT VERSIONS
        
        System.out.println("Enter the distance in km:");
        int distanceKm = sc.nextInt();

        System.out.println("Enter the time in minutes:");
        int timeMin = sc.nextInt(); // these are diff from above because  compiler thinks user typed a blank space as nextInt gives an empty value to next input and next input is nextline(


        sc.nextLine(); // consume leftover newline  

        System.out.println("Are you local? Type Y if yes");
        String local = sc.nextLine();

        System.out.println("Is the travel during the night? Type Y if yes");
        String nightTravel = sc.nextLine();

        
        String result=(local=='Y')?localFare(distanceKm,timeMin):nonLocalFare(distanceKm,timeMin);
        String restult2=(nightTravel=='Y')?nightTravelFare(distanceKm,timeMin):nonNightTravel(distanceKm,timeMin);
        
        System.out.println(result);
        sc.close();

    }
}


private static String localFare(int km, int min) {
        int baseFare = 20;
        int perKilo = 15;
        int perMin = 10;

        float beforeDiscount = baseFare + (perKilo * km) + (perMin * min);
        float totalFare = beforeDiscount - (0.10f * beforeDiscount);

        return "Local Fare:\n" +
                "Base Fare: 20\n" +
                "Per Km: 15\n" +
                "Per Min: 10\n" +
                "10% Discount Applied\n" +
                "Total Fare = Rs " + totalFare;
    }
private static String nonLocalFare(int km, int min)
{
    int baseFare=20;
    int perKilo=15;
    int permin=10;
    System.out.println("Base Fare is Rs20"+"\n"+"Per Km charge id Rs 15"+"\n"+"Per minute charge is Rs10");
    float totalFare=baseFare+(perkilo*km)+(permin*min);
}

