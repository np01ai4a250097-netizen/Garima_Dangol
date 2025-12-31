package Week6;
import java.util.Scanner;


/**
 * Write a description of class Names here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Names
{
    public static void main(String[]arg)
    {
        
       String []name= {"Saroj","Sushant","Ujjwal","Rabina","Sandesh"};
       //Sysem.out.println(Arrays.toString(names)); also prints names
       for(int i=0; i<name.length; i++)
       {
         System.out.println(name[i]);
       }
       System.out.println("Name at index 2 is "+name[2]);
       name[4]="Hari";
       for(int i=0; i<name.length; i++)
       {
         System.out.println(name[i]);
       }
       System.out.println(name[4]);
       
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the new name: ");
      String newName=sc.nextLine();
      
      name[0]=newName;
      for(int i=0; i<name.length; i++)
       {
         System.out.println(name[i]);
       }
       
       
    }

}