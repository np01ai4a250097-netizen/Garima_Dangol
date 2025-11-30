package week4;
import java.util.Scanner;


/**
 * Write a description of class Grading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grading
{
    public static void main(String[]arg)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter The GPA from0.0 to 4.0:");
    float GPA=sc.nextFloat();
    if(GPA<=4.0){
    System.out.println("The Result is");
    if(GPA<=4.0 && GPA>=3.6){
        System.out.println("A+");
    }
    if(GPA<3.6 && GPA>=3.2){
        System.out.println("A");
    }
    if(GPA<3.2 && GPA>=2.8){
        System.out.println("B+");
    }
    if(GPA<2.8 && GPA>=2.4){
        System.out.println("B");
    }
    if(GPA<2.4 && GPA>=2.0){
        System.out.println("C+");
    }
    if(GPA<2.0 && GPA>=1.6){
        System.out.println("C");
    }
    if(GPA<1.6 ){
        System.out.println("D+");
    }
}

else{
    System.out.println("Invalid Input");
}
}

}