package Week8;


/**
 * Write a description of class displayBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class displayBill
{
    public static void main(String[]arg){
        ElectricityBill ee=new ElectricityBill("ram_factory",580);
        ee.display();
        
        ee.setUnitsConsumed(700);
        System.out.println("Updated units consumed is: " + ee.getUnitsConsumed());
        
        System.out.println("Total electric bill is rs " + ee.calculateBill()); 
    }
    
}