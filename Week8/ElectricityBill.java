package Week8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;
    public ElectricityBill(String consumerName,int unitsConsumed){
        this.consumerName=consumerName;
        this.unitsConsumed=unitsConsumed;
    }
    public void display(){
        System.out.println("Name is "+this.consumerName);
        System.out.println("Units consumed is "+this.unitsConsumed);
        
    
    }
    public void setUnitsConsumed(int unitsConsumed ){
        this.unitsConsumed=unitsConsumed;
    }
    public int getUnitsConsumed(){
        return this.unitsConsumed;
    }
    public double calculateBill(){
        double bill; //a variable inside a method
        if(unitsConsumed <= 100) {
            bill = unitsConsumed * 5;
        }
         else {
            bill = (100 * 5) + ((unitsConsumed - 100) * 8);
        
    }
    return bill;
}
}