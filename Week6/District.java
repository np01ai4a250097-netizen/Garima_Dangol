package Week6;
import java.util.Scanner;


/**
 * Write a description of class District here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class District
{
    public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of district you want :");
        int n=sc.nextInt();
        
         sc.nextLine();
         String []district= new String[n];
         for(int i=0; i<district.length; i++){
         System.out.println("Enter the Districts: ");
         district[i] = sc.nextLine();
        }
         for(int i=0; i<district.length; i++){
         System.out.println((i+1) +"."+ district[i]);
         
        }
    }
}