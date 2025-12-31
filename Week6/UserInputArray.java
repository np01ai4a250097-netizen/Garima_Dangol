package Week6;
import java.util.Scanner;

/**
 * Write a description of class UserInputArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputArray
{
    public static void main(String[]arg)
    {
        Scanner sc= new Scanner(System.in);

        String[] studentList= new String[5];

        for(int i=0; i<studentList.length; i++)
        {
            System.out.println("Enter the name of students");
            studentList[i]=sc.nextLine();

        }
        for(int j=0; j<studentList.length; j++)
        {
            System.out.println("Student name is "+studentList[j]+"\t" );
        }

    }
}