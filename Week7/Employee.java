package Week7;
import java.util.Scanner;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    int id;
    String name;
    float salary;
    void works(){
        System.out.println("The employee is working.");
    }
    void meeting(){
        System.out.println("The employee is in a meeting.");
    }
    public static void main(String[]arg){
        
        
        Employee[] list=new Employee[3];
        for(int i=0; i<3; i++){
            Scanner sc= new Scanner(System.in);
            Employee ee=new Employee();
            System.out.println("Enter the id of employee=");
            ee.id=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Enter the name of employee=");
            ee.name = sc.nextLine();
            
            System.out.println("Enter the salary of employee=");
            
            ee.salary=sc.nextFloat();
            
            
            
            list[i]=ee;
            
            //System.out.println("The id of employee is "+ ee.id);
            
            
        }
        
        
        for(int j=0;j<3;j++)
        {
            System.out.print("The id of employee is"+list[j].id);
            System.out.println(" The name of employee "+list[j].name);
            System.out.println( "The salary of employee "+list[j].salary);
        }
        float highestSalary=list[0].salary;
        for(int i=1; i<3; i++){
            if(list[i].salary>highestSalary){
                highestSalary=list[i].salary;
                System.out.println("Highest Salary is "+highestSalary);
                System.out.println("The id of employee with highest salary is"+list[i].id);
                System.out.println(" The name of employee  with highest salary is "+list[i].name);
                System.out.println( "The salary of employee "+list[i].salary);
            }
            
        }
        
        
    }
}