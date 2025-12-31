package Week8;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    public static void main(String[] arg){
        Patient ee = new Patient("Hari",43,12, 50);
        ee.display();
        
        ee.setDaysAdmitted(15);
        System.out.println("Updated days is: " + ee.getDaysAdmitted());
        
        System.out.println("Total Hospital bill in rs " + ee.calculateTotalBill());
        
        Patient ee1 = new Patient("Sita",34,2, 50);
        ee1.display();
        
        ee1.setDaysAdmitted(5);
        System.out.println("Updated days is: " + ee1.getDaysAdmitted());
        
        System.out.println("Total Hospital bill in rs " + ee1.calculateTotalBill());
    }
}