package Week7;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    int modelNumber;// Instance variables , object variable, attribute
    String color;
    double price;
    
    void start()
    {
        System.out.println("Car Starts");
    }
    
    void stop()
    {
        System.out.println("Car Stops");
    }
    
    public static void main(String[]arg)
    {
        Car c =new  Car();//it is an object 
        //Car c; is not an object
        c.color="Red";
        c.modelNumber=123;
        c.price=234567;
        
        System.out.println("Model Number is "+c.modelNumber);
        System.out.println("color is "+c.color);
        System.out.println("Price is "+c.price);
        
        c.start();//method calling ,change in behaviour, method invocation
        c.stop();
        
        Car c1 =new  Car();
        c1.color="Blue";
        c1.modelNumber=9870000;
        c1.price=900000;
        
        System.out.println("Model Number is "+c1.modelNumber);
        System.out.println("color is "+c1.color);
        System.out.println("Price is "+c1.price);
        
        c1.start();//method calling ,change in behaviour, method invocation
        c1.stop();
        
        
    }
    
}