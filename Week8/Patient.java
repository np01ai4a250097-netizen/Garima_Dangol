package Week8;


/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge){
        this.patientName=patientName;
        this.age=age;
        this.daysAdmitted=daysAdmitted;
        this.dailyCharge=dailyCharge;
    }
    public void display(){
        System.out.println("Name = "+this.patientName);
        System.out.println("Age = "+this.age);
        System.out.println("Days Admitted = "+this.daysAdmitted);
        System.out.println("Daily Charges = "+this.dailyCharge);
    }
    public void setDaysAdmitted(int daysAdmitted){
        this.daysAdmitted=daysAdmitted;
    }
    public int getDaysAdmitted(){
        return this.daysAdmitted;
    }
    public double calculateTotalBill(){
        double hospitalBill;
        if(daysAdmitted<=7){
            hospitalBill= daysAdmitted * dailyCharge;
        }
        else{
            hospitalBill=(daysAdmitted * dailyCharge)-((daysAdmitted * dailyCharge)*0.1);
        }
        return hospitalBill;
    }
}