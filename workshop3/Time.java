package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Time here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time in seconds: ");
        int sec = sc.nextInt();

        int hours = sec / 3600;
        int r = sec % 3600;        
        int min = r / 60;
        int sec1 = r % 60;         

        System.out.println("In hours: " + hours);
        System.out.println("In minutes: " + min);
        System.out.println("In seconds: " + sec1);
    }
}
