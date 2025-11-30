package workshop3;
import java.util.Scanner;


/**
 * Write a description of class RickshawFare2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in km:");
        int distanceKm = sc.nextInt();

        System.out.println("Enter the time in minutes:");
        int timeMin = sc.nextInt();

        sc.nextLine(); 

        System.out.println("Are you local? Type Y if yes");
        String local = sc.nextLine();

        System.out.println("Is the travel during the night? Type Y if yes");
        String nightTravel = sc.nextLine();

        String fareResult = local.equalsIgnoreCase("Y") ?
                localFare(distanceKm, timeMin) :
                nonLocalFare(distanceKm, timeMin);

        // Combine with night fare if needed
        String result=(local=="Y")?localFare(distanceKm,timeMin):nonLocalFare(distanceKm,timeMin);
        
        System.out.println(fareResult);
        sc.close();
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

    private static String nonLocalFare(int km, int min) {
        int baseFare = 20;
        int perKilo = 15;
        int perMin = 10;

        float totalFare = baseFare + (perKilo * km) + (perMin * min);

        return "Non-Local Fare:\n" +
                "Base Fare: 20\n" +
                "Per Km: 15\n" +
                "Per Min: 10\n" +
                "Total Fare = Rs " + totalFare;
    }

    private static String nightTravelFare(int km, int min) {
        float nightCharge = 0.20f; // 20% extra
        int perKilo = 15;
        int perMin = 10;
        int baseFare = 20;

        float before = baseFare + (perKilo * km) + (perMin * min);
        float total = before + (nightCharge * before);

        return "Night Charge Applied (20% Extra)\nNight Fare = Rs " + total;
    }
}
