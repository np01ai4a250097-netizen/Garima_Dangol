package Week8;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[]arg){
    BankAccount ss = new BankAccount(1234,2000,"Ram");
    ss.display();
    double x=ss.getbalance();
      System.out.println(x);
    String message=ss.deposit(5000);
    System.out.println(message);
    
    
      
    System.out.println(ss.Withdraw(2000)); 
     boolean success = ss.Withdraw(2000);

        if (success) {
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Withdrawal failed");
        }
    
    
      double x1=ss.getbalance();
      System.out.println("The final balance is " +x1);

      
}
    
    
}