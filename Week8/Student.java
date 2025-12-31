package Week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName="Islington";// using this because everyone goes to the same college
    
    public Student(int id, String name, String address,long phoneNumber)
    {
       this.id=id;
       this.name=name;
       this.address=address;
       this.phoneNumber=phoneNumber;
    }
    public void display()
    {
        System.out.println("ID is "+this.id);
        System.out.println("Name is "+this.name);
        System.out.println(" Addressis "+this.address);
        System.out.println(" Phone Number is "+this.phoneNumber);
        System.out.println(" College is "+this.collegeName);
    
    }
}