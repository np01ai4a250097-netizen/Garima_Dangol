import java.util.Scanner;

/**
 * Write a description of class StudentInformation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInformation
{
 public static void main (String[]arg)
 {
    Scanner sc=new Scanner(System.in); // scanner is a inbuilt keyword
    System.out.println("Enter the students name:");
    String studentName=sc.nextLine();
    System.out.println("Enter the students age:");
    int studentAge=sc.nextInt();
    System.out.println("Enter the students GPA:");
    float studentGpa=sc.nextFloat();
    
    System.out.println("Student Name:"+ studentName);
    System.out.println("Student Age:"+ studentAge);
    System.out.println("Student GPA:"+ studentGpa);
    
    }
}