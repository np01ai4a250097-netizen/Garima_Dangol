package Week8;


/**
 * Write a description of class GrossSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GrossSalary
{
    public static void main(String[]arg)
    {
        EmployeeSalary ss = new EmployeeSalary(1,20000,"Ram");

        ss.display();
        
        double x=ss.calculateGrossSalary();
        System.out.println("The gross salary"+x);
    
    }
}