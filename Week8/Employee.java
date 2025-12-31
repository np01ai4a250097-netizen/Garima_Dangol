package Week8;


/**
 * Write a description of class employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
 
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id,String name,double salary)
    {
      this.id=id;
      //instance=local
      this.name=name;
      this.salary=salary;
      
    }
    
    public void display()
    {
        System.out.println("ID is "+this.id);
        System.out.println("Name is "+this.name);
        System.out.println("Salary is "+this.salary);
    
    }
    
    public double getSalary()
    {
     double annualSalary=this.salary*12;
     return annualSalary;
     
    }
    
    public void setName(String name) //setter method
    {
     this.name=name;
    }
    
    public int getId() //getter method
    {
      return this.id;
    }

}