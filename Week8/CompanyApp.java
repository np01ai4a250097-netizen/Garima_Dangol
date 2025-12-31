package Week8;


/**
 * Write a description of class CompanyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CompanyApp
{
    public static void main(String[]arg)
    {
      Employee ee=new Employee(100,"Ram",200.78);
      
      ee.display();
      
      Employee e1=new Employee(200,"Shyam",852.12);
      e1.display();
      
      double x=ee.getSalary();
      System.out.println(x);
      
      ee.setName("Raam");
      ee.display();
      
      int y=e1.getId();
      System.out.println(y);
      
    }
}