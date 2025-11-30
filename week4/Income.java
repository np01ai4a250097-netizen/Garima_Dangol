package week4;
import java.util.Scanner;


/**
 * Write a description of class Income here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Income
{
     public static void main(String[]arg){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the income:");
    float salary=sc.nextFloat();
    if(salary<=500000){
        System.out.println("Your tax is 1%");
         float s1=salary*0.01f;
         System.out.println("Your tax amount is= Rs" +s1);
        
    }
    else if(salary>500000 && salary<=700000){
        System.out.println("Your tax is 5000+ 10% income");
        float s1=5000+salary*0.1f;
        System.out.println("Your tax amount is= Rs" +s1);
    }
    else if(salary>700000 && salary<=1000000){
        System.out.println("Your tax is 15000+ 20% income");
        float s1=15000+salary*0.2f;
        System.out.println("Your tax amount is= Rs" +s1);
    }
    else if(salary>1000000 && salary<=2000000){
        System.out.println("Your tax is 35000+ 30% income");
        float s1=35000+salary*0.3f;
        System.out.println("Your tax amount is= Rs" +s1);
    }
    else if(salary>2000000 && salary<=5000000){
        System.out.println("Your tax is 355000+ 36% income");
        float s1=355000+salary*0.36f;
        System.out.println("Your tax amount is= Rs" +s1);
    }
    else{
    System.out.println("Your tax is 1135000+ 39% income");
        float s1=1135000+salary*0.39f;
        System.out.println("Your tax amount is= Rs" +s1);
    }
    }
    

}