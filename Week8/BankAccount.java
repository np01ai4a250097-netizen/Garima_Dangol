package Week8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private long accountNumber;
    private double balance;
    private String name;
    
    public BankAccount(long accountNumber,double balance,String name){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.name=name;
        
    }
    public void display(){
        System.out.println("The Account Number  is "+this.accountNumber);
        System.out.println("The balance  is "+ this.balance);
        System.out.println("The name is "+ this.name);
    }
    
    public double getbalance() //getter method
    {
      return this.balance;
    }
    public String deposit(double amount){ 
      this.balance=this.balance+amount;
      return "deposited amount is"+amount+"and balance is"+this.balance;
      
        
    }
    public boolean Withdraw(double amount2){//boolean acc to qn as we need to check the answers but strig also can Be written if we do not require to check the balances
        
        if(amount2<=this.balance){
            this.balance=this.balance-amount2;
        
    return true; 
        }
        else{
            
            return false; 
        }
    }
}