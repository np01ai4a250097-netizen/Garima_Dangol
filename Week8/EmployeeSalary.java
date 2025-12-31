package Week8;


/**
 * Write a description of class EmployeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    private int id;
    private double basicSalary;
    private String name;
    
    public EmployeeSalary( int id, double basicSalary,String name){
        this.id=id;
        this.basicSalary=basicSalary;
        this.name=name;
    }
    public void display()
    {
        System.out.println("The ID is " +this.id);
        System.out.println("The Salary is " +this.basicSalary);
        System.out.println("The Name is " +this.name);
    }
    public double calculateGrossSalary()
    {
        double x=(basicSalary*0.2)+ basicSalary;
        return x;
    }
}